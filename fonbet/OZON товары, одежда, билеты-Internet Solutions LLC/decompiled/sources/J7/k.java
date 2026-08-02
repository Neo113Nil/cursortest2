package J7;

import K7.r;
import K7.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    private static final K7.h f14174c = new K7.h("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    r f14175a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14176b;

    public k(Context context) {
        this.f14176b = context.getPackageName();
        if (t.a(context)) {
            this.f14175a = new r(context, f14174c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
        }
    }

    public final Task a() {
        Object[] objArr = {this.f14176b};
        K7.h hVar = f14174c;
        hVar.d("requestInAppReview (%s)", objArr);
        r rVar = this.f14175a;
        if (rVar == null) {
            hVar.b(new Object[0]);
            return Tasks.forException(new a(new Status(-1, String.format(Locale.getDefault(), "Review Error(%d): %s", -1, L7.a.a()))));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        rVar.p(new i(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
