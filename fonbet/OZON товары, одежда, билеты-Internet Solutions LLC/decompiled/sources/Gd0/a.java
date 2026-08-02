package Gd0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final NotificationDTO f10076a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f10077b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10078c;

    public a(NotificationDTO notificationDTO, Long l11, String str) {
        this.f10076a = notificationDTO;
        this.f10077b = l11;
        this.f10078c = str;
    }

    public final NotificationDTO a() {
        return this.f10076a;
    }

    public final String b() {
        return this.f10078c;
    }

    public final Long c() {
        return this.f10077b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f10076a, aVar.f10076a) && Intrinsics.d(this.f10077b, aVar.f10077b) && Intrinsics.d(this.f10078c, aVar.f10078c);
    }

    public final int hashCode() {
        NotificationDTO notificationDTO = this.f10076a;
        int hashCode = (notificationDTO == null ? 0 : notificationDTO.hashCode()) * 31;
        Long l11 = this.f10077b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f10078c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InAppPushEntity(notificationDto=");
        sb2.append(this.f10076a);
        sb2.append(", refreshIntervalMs=");
        sb2.append(this.f10077b);
        sb2.append(", pixelUrl=");
        return o0.c(sb2, this.f10078c, ")");
    }
}
