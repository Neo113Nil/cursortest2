package androidx.work.impl.utils;

/* loaded from: classes7.dex */
public class LiveDataUtils {
    public static <In, Out> androidx.view.LiveData<Out> dedupedMappedLiveDataFor(androidx.view.LiveData<In> liveData, androidx.arch.core.util.Function<In, Out> function, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        java.lang.Object obj = new java.lang.Object();
        androidx.view.MediatorLiveData mediatorLiveData = new androidx.view.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.work.impl.utils.LiveDataUtils.AnonymousClass1(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    class AnonymousClass1<In> implements androidx.view.Observer<In> {
        final /* synthetic */ androidx.arch.core.util.Function Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.work.impl.utils.taskexecutor.TaskExecutor getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.view.MediatorLiveData getHighSpeedVideoFpsRangesFor;
        Out getHighSpeedVideoSizes = null;

        AnonymousClass1(androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, java.lang.Object obj, androidx.arch.core.util.Function function, androidx.view.MediatorLiveData mediatorLiveData) {
            this.getHighResolutionOutputSizeshNQ4ISI = taskExecutor;
            this.getHighSpeedVideoFpsRanges = obj;
            this.Camera2StreamConfigurationMap = function;
            this.getHighSpeedVideoFpsRangesFor = mediatorLiveData;
        }

        @Override // androidx.view.Observer
        public void onChanged(final In in) {
            this.getHighResolutionOutputSizeshNQ4ISI.executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoFpsRanges) {
                        ?? apply = androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.Camera2StreamConfigurationMap.apply(in);
                        if (androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoSizes == 0 && apply != 0) {
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoSizes = apply;
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.postValue(apply);
                        } else if (androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoSizes != 0 && !androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoSizes.equals(apply)) {
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoSizes = apply;
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.postValue(apply);
                        }
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }
}
