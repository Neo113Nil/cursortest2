package kotlinx.coroutines.guava;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ \u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\r\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR(\u0010#\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\"*\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lkotlinx/coroutines/guava/JobListenableFuture;", "T", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlinx/coroutines/Job;", "p0", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "", "Camera2StreamConfigurationMap", "(Ljava/lang/Throwable;)Z", "isCancelled", "()Z", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "p1", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "Ljava/util/concurrent/Executor;", "", "addListener", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "isDone", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Z)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRangesFor", "Lcom/google/common/util/concurrent/SettableFuture;", "", "getHighSpeedVideoFpsRanges", "Lcom/google/common/util/concurrent/SettableFuture;", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class JobListenableFuture<T> implements com.google.common.util.concurrent.ListenableFuture<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    final com.google.common.util.concurrent.SettableFuture<java.lang.Object> getHighSpeedVideoFpsRanges = com.google.common.util.concurrent.SettableFuture.create();

    public JobListenableFuture(kotlinx.coroutines.Job job) {
        this.getHighSpeedVideoFpsRangesFor = job;
    }

    public final boolean Camera2StreamConfigurationMap(java.lang.Throwable p0) {
        if (p0 instanceof java.util.concurrent.CancellationException) {
            return this.getHighSpeedVideoFpsRanges.set(new kotlinx.coroutines.guava.Cancelled((java.util.concurrent.CancellationException) p0));
        }
        boolean exception = this.getHighSpeedVideoFpsRanges.setException(p0);
        if (exception) {
            this.Camera2StreamConfigurationMap = true;
        }
        return exception;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.getHighSpeedVideoFpsRanges.isCancelled()) {
            return true;
        }
        if (isDone() && !this.Camera2StreamConfigurationMap) {
            try {
                if (com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.getHighSpeedVideoFpsRanges) instanceof kotlinx.coroutines.guava.Cancelled) {
                    return true;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                return true;
            } catch (java.util.concurrent.ExecutionException unused2) {
                this.Camera2StreamConfigurationMap = true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Future
    public final T get() {
        T t = (T) this.getHighSpeedVideoFpsRanges.get();
        if (t instanceof kotlinx.coroutines.guava.Cancelled) {
            throw new java.util.concurrent.CancellationException().initCause(((kotlinx.coroutines.guava.Cancelled) t).getHighSpeedVideoSizes);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Future
    public final T get(long p0, java.util.concurrent.TimeUnit p1) {
        T t = (T) this.getHighSpeedVideoFpsRanges.get(p0, p1);
        if (t instanceof kotlinx.coroutines.guava.Cancelled) {
            throw new java.util.concurrent.CancellationException().initCause(((kotlinx.coroutines.guava.Cancelled) t).getHighSpeedVideoSizes);
        }
        return t;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable p0, java.util.concurrent.Executor p1) {
        this.getHighSpeedVideoFpsRanges.addListener(p0, p1);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.getHighSpeedVideoFpsRanges.isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean p0) {
        if (!this.getHighSpeedVideoFpsRanges.cancel(p0)) {
            return false;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.getHighSpeedVideoFpsRangesFor, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                java.lang.Object uninterruptibly = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.getHighSpeedVideoFpsRanges);
                if (uninterruptibly instanceof kotlinx.coroutines.guava.Cancelled) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CANCELLED, cause=[");
                    sb2.append(((kotlinx.coroutines.guava.Cancelled) uninterruptibly).getHighSpeedVideoSizes);
                    sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb2.toString());
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("SUCCESS, result=[");
                    sb3.append(uninterruptibly);
                    sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb3.toString());
                }
            } catch (java.util.concurrent.CancellationException unused) {
                sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("FAILURE, cause=[");
                sb4.append(e.getCause());
                sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                sb.append(sb4.toString());
            } catch (java.lang.Throwable th) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("UNKNOWN, cause=[");
                sb5.append(th.getClass());
                sb5.append(" thrown from get()]");
                sb.append(sb5.toString());
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PENDING, delegate=[");
            sb6.append(this.getHighSpeedVideoFpsRanges);
            sb6.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            sb.append(sb6.toString());
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
