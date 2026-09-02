package o1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class A extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f6253a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(int i2) {
        super("stream was reset: ".concat(r0));
        String str;
        switch (i2) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "REFUSED_STREAM";
                break;
            case 6:
                str = "CANCEL";
                break;
            case 7:
                str = "COMPRESSION_ERROR";
                break;
            case 8:
                str = "CONNECT_ERROR";
                break;
            case 9:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 10:
                str = "INADEQUATE_SECURITY";
                break;
            case 11:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        this.f6253a = i2;
    }
}
