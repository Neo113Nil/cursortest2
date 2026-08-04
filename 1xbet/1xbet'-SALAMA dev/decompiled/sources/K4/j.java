package K4;

import java.util.Arrays;
import java.util.HashSet;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f4023d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f4024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L4.f f4025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f4026c;

    public j(L4.f fVar, P2 p5, r rVar) {
        this.f4025b = fVar;
        this.f4024a = p5;
        this.f4026c = rVar;
    }

    public static boolean a(B4.H h6) {
        switch (h6) {
            case OK:
                throw new IllegalArgumentException("Treated status OK as error");
            case CANCELLED:
            case UNKNOWN:
            case DEADLINE_EXCEEDED:
            case RESOURCE_EXHAUSTED:
            case INTERNAL:
            case UNAVAILABLE:
            case UNAUTHENTICATED:
                return false;
            case INVALID_ARGUMENT:
            case NOT_FOUND:
            case ALREADY_EXISTS:
            case PERMISSION_DENIED:
            case FAILED_PRECONDITION:
            case ABORTED:
            case OUT_OF_RANGE:
            case UNIMPLEMENTED:
            case DATA_LOSS:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + h6);
        }
    }
}
