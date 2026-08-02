package BN;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.M;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dj.g;
import dj.j;
import dj.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsWidgetViewHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements M, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3268b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f3267a = obj;
        this.f3268b = obj2;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        HotelsBookAdditionsWidgetViewHolder.showSelector$lambda$8$lambda$7((HotelsBookAdditionsWidgetViewHolder) this.f3267a, (ComponentCallbacksC5392m) this.f3268b, str, bundle);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        boolean isSuccessful = task.isSuccessful();
        Function1 function1 = (Function1) this.f3267a;
        if (isSuccessful) {
            function1.invoke(new j.c(k.GOOGLE_PLAY));
            return;
        }
        if (((Task) this.f3268b).isCanceled()) {
            function1.invoke(new j.a(0));
            return;
        }
        Exception error = task.getException();
        if (error == null) {
            error = new IllegalStateException("Не смогли выполнить оценку " + k.GOOGLE_PLAY);
        }
        Intrinsics.checkNotNullParameter(error, "error");
        function1.invoke(new j.b(new g(error)));
    }
}
