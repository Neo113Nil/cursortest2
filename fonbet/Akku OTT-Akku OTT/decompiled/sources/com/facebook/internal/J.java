package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.graphics.C0235r;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0688a;
import com.facebook.C0727p;
import com.facebook.C0728q;
import com.facebook.C0729s;
import com.facebook.internal.J;
import com.facebook.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.haryanvi.netstream.R;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nWebDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebDialog.kt\ncom/facebook/internal/WebDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,870:1\n1#2:871\n*E\n"})
/* loaded from: classes3.dex */
public class J extends Dialog {
    public static final b Companion = new b();
    public static volatile int o;
    public String a;
    public String b;
    public d c;
    public g d;
    public ProgressDialog e;
    public ImageView f;
    public FrameLayout i;
    public final e j;
    public boolean k;
    public boolean l;
    public boolean m;
    public WindowManager.LayoutParams n;

    public static class a {
        public FragmentActivity a;
        public String b;
        public d c;
        public Bundle d;
    }

    public static final class b {
    }

    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            J j = J.this;
            if (!j.l && (progressDialog = j.e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = j.i;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            g gVar = j.d;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
            ImageView imageView = j.f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            j.m = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            E e = E.a;
            com.facebook.w wVar = com.facebook.w.a;
            super.onPageStarted(view, url, bitmap);
            J j = J.this;
            if (j.l || (progressDialog = j.e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i, description, failingUrl);
            J.this.e(new C0727p(description, i, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            J.this.e(new C0727p(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean contains$default;
            int i;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            E e = E.a;
            com.facebook.w wVar = com.facebook.w.a;
            Uri parse = Uri.parse(url);
            boolean z = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
            J j = J.this;
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(url, j.b, false, 2, null);
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(url, "fbconnect://cancel", false, 2, null);
                if (startsWith$default2) {
                    j.cancel();
                    return true;
                }
                if (!z) {
                    contains$default = StringsKt__StringsKt.contains$default(url, "touch", false, 2, (Object) null);
                    if (!contains$default) {
                        try {
                            j.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
                return false;
            }
            Bundle c = j.c(url);
            String string = c.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (string == null) {
                string = c.getString("error_type");
            }
            String string2 = c.getString("error_msg");
            if (string2 == null) {
                string2 = c.getString("error_message");
            }
            if (string2 == null) {
                string2 = c.getString("error_description");
            }
            String string3 = c.getString("error_code");
            if (string3 != null && !E.z(string3)) {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                if (!E.z(string) && E.z(string2) && i == -1) {
                    d dVar = j.c;
                    if (dVar != null && !j.k) {
                        j.k = true;
                        dVar.a(c, null);
                        j.dismiss();
                    }
                } else if (string == null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                    j.cancel();
                } else if (i != 4201) {
                    j.cancel();
                } else {
                    j.e(new com.facebook.y(new com.facebook.t(i, string, string2), string2));
                }
                return true;
            }
            i = -1;
            if (!E.z(string)) {
            }
            if (string == null) {
            }
            if (i != 4201) {
            }
            return true;
        }
    }

    public interface d {
        void a(Bundle bundle, C0728q c0728q);
    }

    @SourceDebugExtension({"SMAP\nWebDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebDialog.kt\ncom/facebook/internal/WebDialog$UploadStagingResourcesTask\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,870:1\n26#2:871\n*S KotlinDebug\n*F\n+ 1 WebDialog.kt\ncom/facebook/internal/WebDialog$UploadStagingResourcesTask\n*L\n682#1:871\n*E\n"})
    public final class e extends AsyncTask<Void, Void, String[]> {
        public final String a;
        public final Bundle b;
        public Exception[] c;
        public final /* synthetic */ J d;

        public e(J j, String action, Bundle parameters) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = j;
            this.a = action;
            this.b = parameters;
            this.c = new Exception[0];
        }

        /* JADX WARN: Type inference failed for: r9v1, types: [com.facebook.internal.K] */
        public final String[] a(Void... p0) {
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                        try {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            String[] stringArray = this.b.getStringArray("media");
                            if (stringArray != null) {
                                final String[] strArr = new String[stringArray.length];
                                this.c = new Exception[stringArray.length];
                                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                                C0688a.Companion.getClass();
                                C0688a b = C0688a.b.b();
                                try {
                                    int length = stringArray.length;
                                    for (final int i = 0; i < length; i++) {
                                        if (isCancelled()) {
                                            Iterator it = concurrentLinkedQueue.iterator();
                                            while (it.hasNext()) {
                                                ((com.facebook.C) it.next()).cancel(true);
                                            }
                                        } else {
                                            Uri uri = Uri.parse(stringArray[i]);
                                            if (E.A(uri)) {
                                                strArr[i] = uri.toString();
                                                countDownLatch.countDown();
                                            } else {
                                                ?? r9 = new z.b() { // from class: com.facebook.internal.K
                                                    @Override // com.facebook.z.b
                                                    public final void a(com.facebook.E response) {
                                                        com.facebook.t tVar;
                                                        String str;
                                                        int i2 = i;
                                                        String[] results = strArr;
                                                        Intrinsics.checkNotNullParameter(results, "$results");
                                                        J.e this$0 = this;
                                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                                        CountDownLatch latch = countDownLatch;
                                                        Intrinsics.checkNotNullParameter(latch, "$latch");
                                                        Intrinsics.checkNotNullParameter(response, "response");
                                                        try {
                                                            tVar = response.c;
                                                            str = "Error staging photo.";
                                                        } catch (Exception e) {
                                                            this$0.c[i2] = e;
                                                        }
                                                        if (tVar != null) {
                                                            String h = tVar.h();
                                                            if (h != null) {
                                                                str = h;
                                                            }
                                                            throw new com.facebook.r(response, str);
                                                        }
                                                        JSONObject jSONObject = response.b;
                                                        if (jSONObject == null) {
                                                            throw new C0728q("Error staging photo.");
                                                        }
                                                        String optString = jSONObject.optString("uri");
                                                        if (optString == null) {
                                                            throw new C0728q("Error staging photo.");
                                                        }
                                                        results[i2] = optString;
                                                        latch.countDown();
                                                    }
                                                };
                                                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                                concurrentLinkedQueue.add(com.facebook.share.internal.a.a(b, uri, r9).d());
                                            }
                                        }
                                    }
                                    countDownLatch.await();
                                    return strArr;
                                } catch (Exception unused) {
                                    Iterator it2 = concurrentLinkedQueue.iterator();
                                    while (it2.hasNext()) {
                                        ((com.facebook.C) it2.next()).cancel(true);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, this);
                    return null;
                }
            }
            return null;
        }

        public final void b(String[] strArr) {
            Bundle bundle = this.b;
            J j = this.d;
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = j.e;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    for (Exception exc : this.c) {
                        if (exc != null) {
                            j.e(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        j.e(new C0728q("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = ArraysKt.asList(strArr);
                    if (asList.contains(null)) {
                        j.e(new C0728q("Failed to stage photos for web dialog"));
                        return;
                    }
                    E.F(bundle, new JSONArray((Collection) asList));
                    j.a = E.a(A.a(), com.facebook.w.d() + "/dialog/" + this.a, bundle).toString();
                    ImageView imageView = j.f;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    j.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, this);
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                        try {
                            return a(voidArr);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, this);
                    return null;
                }
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                    return;
                }
                try {
                    b(strArr);
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, this);
            }
        }
    }

    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.A.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class g extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J(Context context, String url) {
        super(context, r0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Companion.getClass();
        F.f();
        int i = o;
        if (i == 0) {
            F.f();
            i = o;
        }
        this.b = "fbconnect://success";
        this.a = url;
    }

    public static int a(int i, float f2, int i2, int i3) {
        int i4 = (int) (i / f2);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    @JvmStatic
    public static final void b(FragmentActivity fragmentActivity) {
        Companion.getClass();
        if (fragmentActivity == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = fragmentActivity.getPackageManager().getApplicationInfo(fragmentActivity.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && o == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = R.style.com_facebook_activity_theme;
                }
                o = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting(otherwise = 4)
    public Bundle c(String str) {
        Uri parse = Uri.parse(str);
        Bundle E = E.E(parse.getQuery());
        E.putAll(E.E(parse.getFragment()));
        return E;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.k) {
            return;
        }
        e(new C0729s());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int min = Math.min(a(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(a(i, displayMetrics.density, 800, PlatformPlugin.DEFAULT_SYSTEM_UI), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        g gVar = this.d;
        if (gVar != null) {
            gVar.stopLoading();
        }
        if (!this.l && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.c == null || this.k) {
            return;
        }
        this.k = true;
        C0728q c0728q = exc instanceof C0728q ? (C0728q) exc : new C0728q(exc);
        d dVar = this.c;
        if (dVar != null) {
            dVar.a(null, c0728q);
        }
        dismiss();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.setHorizontalScrollBarEnabled(false);
        }
        g gVar3 = this.d;
        if (gVar3 != null) {
            gVar3.setWebViewClient(new c());
        }
        g gVar4 = this.d;
        WebSettings settings = gVar4 != null ? gVar4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        g gVar5 = this.d;
        if (gVar5 != null) {
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            gVar5.loadUrl(str);
        }
        g gVar6 = this.d;
        if (gVar6 != null) {
            gVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        g gVar7 = this.d;
        if (gVar7 != null) {
            gVar7.setVisibility(4);
        }
        g gVar8 = this.d;
        WebSettings settings2 = gVar8 != null ? gVar8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        g gVar9 = this.d;
        WebSettings settings3 = gVar9 != null ? gVar9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        g gVar10 = this.d;
        if (gVar10 != null) {
            gVar10.setFocusable(true);
        }
        g gVar11 = this.d;
        if (gVar11 != null) {
            gVar11.setFocusableInTouchMode(true);
        }
        g gVar12 = this.d;
        if (gVar12 != null) {
            gVar12.setOnTouchListener(new G());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager d2;
        boolean isAutofillSupported;
        boolean isEnabled;
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.l = false;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        E e2 = E.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (d2 = C0235r.d(context.getSystemService(androidx.compose.ui.graphics.q.d()))) != null) {
            isAutofillSupported = d2.isAutofillSupported();
            if (isAutofillSupported) {
                isEnabled = d2.isEnabled();
                if (isEnabled && (layoutParams = this.n) != null && layoutParams.token == null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                    WindowManager.LayoutParams layoutParams2 = this.n;
                    Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.H
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    J this$0 = J.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.i = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J this$0 = J.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.cancel();
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(2131230865);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.a != null) {
            ImageView imageView4 = this.f;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.l = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4) {
            g gVar = this.d;
            if (gVar != null && gVar.canGoBack()) {
                g gVar2 = this.d;
                if (gVar2 != null) {
                    gVar2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e eVar = this.j;
        if (eVar != null) {
            if ((eVar != null ? eVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (eVar != null) {
                    eVar.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        e eVar = this.j;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.n = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(FragmentActivity fragmentActivity, String str, Bundle bundle, com.facebook.login.A a2, d dVar) {
        super(fragmentActivity, o);
        Uri a3;
        Companion.getClass();
        F.f();
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = E.w(fragmentActivity) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "touch");
        bundle.putString("client_id", com.facebook.w.b());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.3.0"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.c = dVar;
        if (Intrinsics.areEqual(str, FirebaseAnalytics.Event.SHARE) && bundle.containsKey("media")) {
            this.j = new e(this, str, bundle);
            return;
        }
        if (f.$EnumSwitchMapping$0[a2.ordinal()] == 1) {
            a3 = E.a(A.b(), "oauth/authorize", bundle);
        } else {
            a3 = E.a(A.a(), com.facebook.w.d() + "/dialog/" + str, bundle);
        }
        this.a = a3.toString();
    }
}
