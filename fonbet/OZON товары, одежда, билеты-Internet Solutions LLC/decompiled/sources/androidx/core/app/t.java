package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class t {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f42037a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final Intent f42038b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f42039c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Uri> f42040d;

        public a(@NonNull Context context) {
            Activity activity;
            context.getClass();
            this.f42037a = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f42038b = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f42038b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f42038b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        @NonNull
        @Deprecated
        public static a b(@NonNull Activity activity) {
            return new a(activity);
        }

        @NonNull
        public final Intent a() {
            ArrayList<Uri> arrayList = this.f42040d;
            Intent intent = this.f42038b;
            if (arrayList == null || arrayList.size() <= 1) {
                intent.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList2 = this.f42040d;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    intent.removeExtra("android.intent.extra.STREAM");
                    intent.setClipData(null);
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    intent.putExtra("android.intent.extra.STREAM", this.f42040d.get(0));
                    t.a(intent, this.f42040d);
                }
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f42040d);
                t.a(intent, this.f42040d);
            }
            return Intent.createChooser(intent, this.f42039c);
        }

        @NonNull
        public final void c(int i11) {
            this.f42039c = this.f42037a.getText(i11);
        }

        @NonNull
        public final void d(String str) {
            this.f42039c = str;
        }

        @NonNull
        public final void e(Uri uri) {
            this.f42040d = null;
            if (uri != null) {
                ArrayList<Uri> arrayList = new ArrayList<>();
                this.f42040d = arrayList;
                arrayList.add(uri);
            }
        }

        @NonNull
        public final void f(CharSequence charSequence) {
            this.f42038b.putExtra("android.intent.extra.TEXT", charSequence);
        }

        @NonNull
        public final void g(String str) {
            this.f42038b.setType(str);
        }

        public final void h() {
            this.f42037a.startActivity(a());
        }
    }

    static void a(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i11 = 1; i11 < size; i11++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i11)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
