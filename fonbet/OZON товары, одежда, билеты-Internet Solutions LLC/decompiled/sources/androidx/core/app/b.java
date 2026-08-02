package androidx.core.app;

import B90.M;
import C.o0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b extends androidx.core.content.a {

    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0761b {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i11) {
            activity.requestPermissions(strArr, i11);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    static class c {
        static boolean a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class d {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void validateRequestPermissionsRequestCode(int i11);
    }

    static class f extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final u f41922a;

        f(u uVar) {
            this.f41922a = uVar;
        }

        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f41922a.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f41922a.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f41922a.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            this.f41922a.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f41922a.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f41922a.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f41922a.onSharedElementsArrived(list, list2, new M(onSharedElementsReadyListener, 4));
        }
    }

    public static void a(@NonNull androidx.appcompat.app.g gVar) {
        gVar.finishAffinity();
    }

    public static void b(@NonNull androidx.fragment.app.r rVar) {
        a.a(rVar);
    }

    public static void c(@NonNull androidx.fragment.app.r rVar) {
        a.b(rVar);
    }

    public static void d(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    Activity activity2 = activity;
                    if (activity2.isFinishing() || d.b(activity2)) {
                        return;
                    }
                    activity2.recreate();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(@NonNull Activity activity, @NonNull String[] strArr, int i11) {
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (TextUtils.isEmpty(strArr[i12])) {
                throw new IllegalArgumentException(o0.c(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i12], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i12));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < strArr.length; i14++) {
                if (!hashSet.contains(Integer.valueOf(i14))) {
                    strArr2[i13] = strArr[i14];
                    i13++;
                }
            }
        }
        if (activity instanceof e) {
            ((e) activity).validateRequestPermissionsRequestCode(i11);
        }
        C0761b.b(activity, strArr, i11);
    }

    public static void f(@NonNull androidx.fragment.app.r rVar, u uVar) {
        a.c(rVar, uVar != null ? new f(uVar) : null);
    }

    public static void g(@NonNull androidx.fragment.app.r rVar, u uVar) {
        a.d(rVar, uVar != null ? new f(uVar) : null);
    }

    public static boolean h(@NonNull Activity activity, @NonNull String str) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i11 >= 32 ? d.a(activity, str) : i11 == 31 ? c.b(activity, str) : C0761b.c(activity, str);
        }
        return false;
    }

    public static void i(@NonNull Activity activity, @NonNull Intent intent, int i11, Bundle bundle) {
        activity.startActivityForResult(intent, i11, bundle);
    }

    public static void j(@NonNull Activity activity, @NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }

    public static void k(@NonNull androidx.fragment.app.r rVar) {
        a.e(rVar);
    }
}
