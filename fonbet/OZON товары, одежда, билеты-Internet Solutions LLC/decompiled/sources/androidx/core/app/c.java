package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public class c {

    private static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityOptions f41923a;

        a(ActivityOptions activityOptions) {
            this.f41923a = activityOptions;
        }

        @Override // androidx.core.app.c
        public final Bundle c() {
            return this.f41923a.toBundle();
        }
    }

    static class b {
        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @NonNull
    public static c a(@NonNull Activity activity, int i11, int i12) {
        return new a(ActivityOptions.makeCustomAnimation(activity, i11, i12));
    }

    @NonNull
    public static c b(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new a(b.a(activity, view, str));
    }

    public Bundle c() {
        throw null;
    }
}
