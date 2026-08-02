package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lnet/idrnd/misnap/iad/Result;", "ValueT", "ErrorT", "", "Failure", "Success", "Lnet/idrnd/misnap/iad/Result$Failure;", "Lnet/idrnd/misnap/iad/Result$Success;"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public abstract class Result<ValueT, ErrorT> {
    public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Result() {
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lnet/idrnd/misnap/iad/Result$Failure;", "ErrorT", "Lnet/idrnd/misnap/iad/Result;", "", "error", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lnet/idrnd/misnap/iad/Result$Failure;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getError"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Failure<ErrorT> extends net.idrnd.misnap.iad.Result {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final java.lang.Object error;

        public Failure(ErrorT errort) {
            super(null);
            this.error = errort;
        }

        public final ErrorT getError() {
            return (ErrorT) this.error;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.error;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof net.idrnd.misnap.iad.Result.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((net.idrnd.misnap.iad.Result.Failure) other).error);
        }

        public final net.idrnd.misnap.iad.Result.Failure<ErrorT> copy(ErrorT error) {
            return new net.idrnd.misnap.iad.Result.Failure<>(error);
        }

        public final ErrorT component1() {
            return (ErrorT) this.error;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ net.idrnd.misnap.iad.Result.Failure copy$default(net.idrnd.misnap.iad.Result.Failure failure, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = failure.error;
            }
            return failure.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lnet/idrnd/misnap/iad/Result$Success;", "ValueT", "Lnet/idrnd/misnap/iad/Result;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lnet/idrnd/misnap/iad/Result$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Success<ValueT> extends net.idrnd.misnap.iad.Result {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final java.lang.Object value;

        public Success(ValueT valuet) {
            super(null);
            this.value = valuet;
        }

        public final ValueT getValue() {
            return (ValueT) this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(value=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof net.idrnd.misnap.iad.Result.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((net.idrnd.misnap.iad.Result.Success) other).value);
        }

        public final net.idrnd.misnap.iad.Result.Success<ValueT> copy(ValueT value) {
            return new net.idrnd.misnap.iad.Result.Success<>(value);
        }

        public final ValueT component1() {
            return (ValueT) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ net.idrnd.misnap.iad.Result.Success copy$default(net.idrnd.misnap.iad.Result.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }
    }
}
