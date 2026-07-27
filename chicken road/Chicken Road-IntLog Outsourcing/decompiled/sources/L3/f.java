package L3;

/* loaded from: classes.dex */
public interface f {
    static {
        Q2.b bVar = Q2.b.f2476a;
        V2.e.a(bVar, "exception.type");
        V2.e.a(bVar, "exception.message");
        V2.e.a(bVar, "exception.stacktrace");
    }

    static W1.e h() {
        Boolean.parseBoolean(V2.d.b("otel.experimental.sdk.jvm_stacktrace", "false"));
        return new W1.e();
    }
}
