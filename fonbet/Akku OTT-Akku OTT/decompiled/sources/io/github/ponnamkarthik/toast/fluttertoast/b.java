package io.github.ponnamkarthik.toast.fluttertoast;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast$Callback;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.d;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.haryanvi.netstream.R;
import io.flutter.FlutterInjector;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements MethodChannel.MethodCallHandler {
    public Context a;
    public Toast b;

    public static final class a extends Toast$Callback {
        public a() {
        }

        public final void onToastHidden() {
            super.onToastHidden();
            b.this.b = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Toast toast;
        Context context = this.a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (!Intrinsics.areEqual(str, "showToast")) {
            if (!Intrinsics.areEqual(str, "cancel")) {
                result.notImplemented();
                return;
            }
            Toast toast2 = this.b;
            if (toast2 != null) {
                toast2.cancel();
                this.b = null;
            }
            result.success(Boolean.TRUE);
            return;
        }
        String valueOf = String.valueOf(call.argument(NotificationCompat.CATEGORY_MESSAGE));
        String valueOf2 = String.valueOf(call.argument(SessionDescription.ATTR_LENGTH));
        String valueOf3 = String.valueOf(call.argument("gravity"));
        Number number = (Number) call.argument("bgcolor");
        Number number2 = (Number) call.argument("textcolor");
        Number number3 = (Number) call.argument("fontSize");
        String str2 = (String) call.argument("fontAsset");
        int i = Intrinsics.areEqual(valueOf3, "top") ? 48 : Intrinsics.areEqual(valueOf3, "center") ? 17 : 80;
        boolean areEqual = Intrinsics.areEqual(valueOf2, "long");
        if (number != null) {
            Object systemService = context.getSystemService("layout_inflater");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            textView.setText(valueOf);
            Drawable drawable = context.getDrawable(R.drawable.corner);
            Intrinsics.checkNotNull(drawable);
            Intrinsics.checkNotNull(drawable);
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            Toast toast3 = new Toast(context);
            this.b = toast3;
            toast3.setDuration(areEqual ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = context.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                String lookupKeyForAsset = FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str2);
                Intrinsics.checkNotNullExpressionValue(lookupKeyForAsset, "getLookupKeyForAsset(...)");
                textView.setTypeface(Typeface.createFromAsset(assets, lookupKeyForAsset));
            }
            Toast toast4 = this.b;
            if (toast4 != null) {
                toast4.setView(inflate);
            }
        } else {
            Objects.toString(number);
            Objects.toString(number2);
            Objects.toString(number3);
            Toast makeText = Toast.makeText(context, valueOf, areEqual ? 1 : 0);
            this.b = makeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = makeText != null ? makeText.getView() : null;
                Intrinsics.checkNotNull(view);
                View findViewById = view.findViewById(android.R.id.message);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                TextView textView2 = (TextView) findViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets2, "getAssets(...)");
                    String lookupKeyForAsset2 = FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str2);
                    Intrinsics.checkNotNullExpressionValue(lookupKeyForAsset2, "getLookupKeyForAsset(...)");
                    textView2.setTypeface(Typeface.createFromAsset(assets2, lookupKeyForAsset2));
                }
            }
        }
        try {
            if (i == 17) {
                Toast toast5 = this.b;
                if (toast5 != null) {
                    toast5.setGravity(i, 0, 0);
                }
            } else if (i != 48) {
                Toast toast6 = this.b;
                if (toast6 != null) {
                    toast6.setGravity(i, 0, 100);
                }
            } else {
                Toast toast7 = this.b;
                if (toast7 != null) {
                    toast7.setGravity(i, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        if (context instanceof Activity) {
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new d(this, 4));
        } else {
            Toast toast8 = this.b;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = this.b) != null) {
            toast.addCallback(new a());
        }
        result.success(Boolean.TRUE);
    }
}
