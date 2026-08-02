package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
final class RxJavaCallAdapter<R> implements retrofit2.CallAdapter<R, java.lang.Object> {
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final java.lang.reflect.Type getInputFormats;

    @javax.annotation.Nullable
    private final rx.Scheduler getOutputFormats;

    RxJavaCallAdapter(java.lang.reflect.Type type, @javax.annotation.Nullable rx.Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.getInputFormats = type;
        this.getOutputFormats = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.getHighSpeedVideoFpsRanges = z4;
        this.getHighSpeedVideoSizes = z5;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: responseType */
    public final java.lang.reflect.Type getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getInputFormats;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object adapt(retrofit2.Call<R> call) {
        rx.Observable.OnSubscribe bodyOnSubscribe;
        rx.Scheduler scheduler;
        rx.Observable.OnSubscribe callEnqueueOnSubscribe = this.getHighResolutionOutputSizeshNQ4ISI ? new retrofit2.adapter.rxjava.CallEnqueueOnSubscribe(call) : new retrofit2.adapter.rxjava.CallExecuteOnSubscribe(call);
        if (this.Camera2StreamConfigurationMap) {
            bodyOnSubscribe = new retrofit2.adapter.rxjava.ResultOnSubscribe(callEnqueueOnSubscribe);
        } else {
            if (this.getHighSpeedVideoFpsRangesFor) {
                bodyOnSubscribe = new retrofit2.adapter.rxjava.BodyOnSubscribe(callEnqueueOnSubscribe);
            }
            rx.Observable create = rx.Observable.create(callEnqueueOnSubscribe);
            scheduler = this.getOutputFormats;
            if (scheduler != null) {
                create = create.subscribeOn(scheduler);
            }
            if (this.getHighSpeedVideoFpsRanges) {
                return this.getHighSpeedVideoSizes ? create.toCompletable() : create;
            }
            return create.toSingle();
        }
        callEnqueueOnSubscribe = bodyOnSubscribe;
        rx.Observable create2 = rx.Observable.create(callEnqueueOnSubscribe);
        scheduler = this.getOutputFormats;
        if (scheduler != null) {
        }
        if (this.getHighSpeedVideoFpsRanges) {
        }
    }
}
