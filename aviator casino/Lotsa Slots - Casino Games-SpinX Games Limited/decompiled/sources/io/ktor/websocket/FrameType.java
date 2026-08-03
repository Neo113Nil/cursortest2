package io.ktor.websocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FrameType.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/websocket/FrameType;", "", "", "controlFrame", "", "opcode", "<init>", "(Ljava/lang/String;IZI)V", "Z", "getControlFrame", "()Z", "I", "getOpcode", "()I", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "TEXT", "BINARY", "CLOSE", "PING", "PONG", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.websocket.FrameType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.FrameType.Companion INSTANCE;
    private static final io.ktor.websocket.FrameType[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;
    public static final io.ktor.websocket.FrameType TEXT = new io.ktor.websocket.FrameType("TEXT", 0, false, 1);
    public static final io.ktor.websocket.FrameType BINARY = new io.ktor.websocket.FrameType("BINARY", 1, false, 2);
    public static final io.ktor.websocket.FrameType CLOSE = new io.ktor.websocket.FrameType("CLOSE", 2, true, 8);
    public static final io.ktor.websocket.FrameType PING = new io.ktor.websocket.FrameType("PING", 3, true, 9);
    public static final io.ktor.websocket.FrameType PONG = new io.ktor.websocket.FrameType("PONG", 4, true, 10);

    private static final /* synthetic */ io.ktor.websocket.FrameType[] $values() {
        return new io.ktor.websocket.FrameType[]{TEXT, BINARY, CLOSE, PING, PONG};
    }

    public static kotlin.enums.EnumEntries<io.ktor.websocket.FrameType> getEntries() {
        return $ENTRIES;
    }

    private FrameType(java.lang.String str, int i, boolean z, int i2) {
        this.controlFrame = z;
        this.opcode = i2;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }

    static {
        java.lang.Object next;
        io.ktor.websocket.FrameType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new io.ktor.websocket.FrameType.Companion(null);
        java.util.Iterator<E> it = getEntries().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((io.ktor.websocket.FrameType) next).opcode;
                do {
                    java.lang.Object next2 = it.next();
                    int i2 = ((io.ktor.websocket.FrameType) next2).opcode;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(next);
        int i3 = ((io.ktor.websocket.FrameType) next).opcode;
        maxOpcode = i3;
        int i4 = i3 + 1;
        io.ktor.websocket.FrameType[] frameTypeArr = new io.ktor.websocket.FrameType[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            java.util.Iterator<E> it2 = getEntries().iterator();
            java.lang.Object obj = null;
            boolean z = false;
            while (true) {
                if (it2.hasNext()) {
                    java.lang.Object next3 = it2.next();
                    if (((io.ktor.websocket.FrameType) next3).opcode == i5) {
                        if (z) {
                            break;
                        }
                        obj = next3;
                        z = true;
                    }
                } else if (z) {
                }
            }
            obj = null;
            frameTypeArr[i5] = obj;
        }
        byOpcodeArray = frameTypeArr;
    }

    /* compiled from: FrameType.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/websocket/FrameType$Companion;", "", "<init>", "()V", "", "opcode", "Lio/ktor/websocket/FrameType;", "get", "(I)Lio/ktor/websocket/FrameType;", "maxOpcode", "I", "", "byOpcodeArray", "[Lio/ktor/websocket/FrameType;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final io.ktor.websocket.FrameType get(int opcode) {
            if (opcode < 0 || opcode > io.ktor.websocket.FrameType.maxOpcode) {
                return null;
            }
            return io.ktor.websocket.FrameType.byOpcodeArray[opcode];
        }
    }

    public static io.ktor.websocket.FrameType valueOf(java.lang.String str) {
        return (io.ktor.websocket.FrameType) java.lang.Enum.valueOf(io.ktor.websocket.FrameType.class, str);
    }

    public static io.ktor.websocket.FrameType[] values() {
        return (io.ktor.websocket.FrameType[]) $VALUES.clone();
    }
}
