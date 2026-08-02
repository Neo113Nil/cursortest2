package retrofit2;

/* loaded from: classes5.dex */
public class HttpException extends java.lang.RuntimeException {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final transient retrofit2.Response<?> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;

    public int code() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String message() {
        return this.Camera2StreamConfigurationMap;
    }

    @javax.annotation.Nullable
    public retrofit2.Response<?> response() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpException(retrofit2.Response<?> response) {
        super(r0.toString());
        java.util.Objects.requireNonNull(response, "response == null");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
        sb.append(response.code());
        sb.append(" ");
        sb.append(response.message());
        this.getHighSpeedVideoFpsRanges = response.code();
        this.Camera2StreamConfigurationMap = response.message();
        this.getHighResolutionOutputSizeshNQ4ISI = response;
    }
}
