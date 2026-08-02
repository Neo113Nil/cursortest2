package Zg0;

import kotlin.jvm.internal.Intrinsics;
import oh0.C8736a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35961a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35962b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f35963c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C8736a f35964d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IMPORTANCE_DEFAULT;
        public static final a IMPORTANCE_HIGH;
        public static final a IMPORTANCE_LOW;
        public static final a IMPORTANCE_MAX;
        public static final a IMPORTANCE_MIN;

        static {
            a aVar = new a("IMPORTANCE_MIN", 0);
            IMPORTANCE_MIN = aVar;
            a aVar2 = new a("IMPORTANCE_LOW", 1);
            IMPORTANCE_LOW = aVar2;
            a aVar3 = new a("IMPORTANCE_DEFAULT", 2);
            IMPORTANCE_DEFAULT = aVar3;
            a aVar4 = new a("IMPORTANCE_HIGH", 3);
            IMPORTANCE_HIGH = aVar4;
            a aVar5 = new a("IMPORTANCE_MAX", 4);
            IMPORTANCE_MAX = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public interface b {
    }

    public h(String pushChannelId, String pushChannelName, a pushNotificationImportance) {
        C8736a pushChannelHandler = new C8736a();
        Intrinsics.checkNotNullParameter(pushChannelId, "pushChannelId");
        Intrinsics.checkNotNullParameter(pushChannelName, "pushChannelName");
        Intrinsics.checkNotNullParameter(pushNotificationImportance, "pushNotificationImportance");
        Intrinsics.checkNotNullParameter(pushChannelHandler, "pushChannelHandler");
        this.f35961a = pushChannelId;
        this.f35962b = pushChannelName;
        this.f35963c = pushNotificationImportance;
        this.f35964d = pushChannelHandler;
    }

    @NotNull
    public final b a() {
        return this.f35964d;
    }

    @NotNull
    public final String b() {
        return this.f35961a;
    }

    @NotNull
    public final String c() {
        return this.f35962b;
    }

    @NotNull
    public final a d() {
        return this.f35963c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f35961a, hVar.f35961a) && Intrinsics.d(this.f35962b, hVar.f35962b) && this.f35963c == hVar.f35963c && Intrinsics.d(this.f35964d, hVar.f35964d);
    }

    public final int hashCode() {
        return this.f35964d.hashCode() + ((this.f35963c.hashCode() + G.g.a(this.f35961a.hashCode() * 31, 31, this.f35962b)) * 29791);
    }

    @NotNull
    public final String toString() {
        return "PushNotificationChannel(pushChannelId=" + this.f35961a + ", pushChannelName=" + this.f35962b + ", pushNotificationImportance=" + this.f35963c + ", pushNotificationId=null, pushChannelDescription=null, pushChannelHandler=" + this.f35964d + ")";
    }
}
