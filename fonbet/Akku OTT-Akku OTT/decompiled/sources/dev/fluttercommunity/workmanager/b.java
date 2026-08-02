package dev.fluttercommunity.workmanager;

import androidx.work.ListenableWorker;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ BackgroundWorker a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Result result = (Result) obj;
        BackgroundWorker.Companion companion = BackgroundWorker.INSTANCE;
        boolean m1723isSuccessimpl = Result.m1723isSuccessimpl(result.getValue());
        BackgroundWorker backgroundWorker = this.a;
        if (m1723isSuccessimpl) {
            Object value = result.getValue();
            if (Result.m1722isFailureimpl(value)) {
                value = null;
            }
            Boolean bool = (Boolean) value;
            backgroundWorker.c(bool != null ? bool.booleanValue() : false ? ListenableWorker.Result.success() : ListenableWorker.Result.retry());
        } else if (Result.m1722isFailureimpl(result.getValue())) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            if (m1719exceptionOrNullimpl != null) {
                m1719exceptionOrNullimpl.getMessage();
            }
            backgroundWorker.c(failure);
        }
        return Unit.INSTANCE;
    }
}
