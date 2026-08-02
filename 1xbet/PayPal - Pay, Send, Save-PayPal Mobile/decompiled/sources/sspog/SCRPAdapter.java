package sspog;

/* loaded from: classes18.dex */
public interface SCRPAdapter {

    public static class PIN_EVENTS {
        public static final int COTS_PIN_BYPASS_EVENT = 3;
        public static final int COTS_PIN_CANCELED_EVENT = 2;
        public static final int COTS_PIN_ENTERED_EVENT = 1;
        public static final int COTS_PIN_TIMEOUT_EVENT = 4;
    }

    int a(boolean z);

    int a(byte[] bArr);

    int a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    boolean a();

    int b(int i, byte[] bArr);

    sspog.SCRPInfo b();

    byte[] b(byte[] bArr);

    byte[] c();

    @java.lang.Deprecated
    default void d() {
    }

    int h(byte[] bArr, byte[] bArr2);

    byte[] h(boolean z);

    byte[] s();

    int t(boolean z);

    int t(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] t();

    byte[] t(byte[] bArr);
}
