package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
public final class Result<T> {

    @javax.annotation.Nullable
    private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @javax.annotation.Nullable
    private final retrofit2.Response<T> getHighSpeedVideoSizes;

    public static <T> retrofit2.adapter.rxjava.Result<T> error(java.lang.Throwable th) {
        if (th == null) {
            throw new java.lang.NullPointerException("error == null");
        }
        return new retrofit2.adapter.rxjava.Result<>(null, th);
    }

    public static <T> retrofit2.adapter.rxjava.Result<T> response(retrofit2.Response<T> response) {
        if (response == null) {
            throw new java.lang.NullPointerException("response == null");
        }
        return new retrofit2.adapter.rxjava.Result<>(response, null);
    }

    private Result(@javax.annotation.Nullable retrofit2.Response<T> response, @javax.annotation.Nullable java.lang.Throwable th) {
        this.getHighSpeedVideoSizes = response;
        this.getHighSpeedVideoFpsRangesFor = th;
    }

    @javax.annotation.Nullable
    public final retrofit2.Response<T> response() {
        return this.getHighSpeedVideoSizes;
    }

    @javax.annotation.Nullable
    public final java.lang.Throwable error() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isError() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public final java.lang.String toString() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Result{isError=true, error=\"");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("\"}");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Result{isError=false, response=");
        sb2.append(this.getHighSpeedVideoSizes);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
