package Dg0;

import Fm.C3051a;
import Sc.InterfaceC3999a;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0007\u0018\u0000 /2\u00020\u0001:\u000201Ba\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010B3\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0011J?\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015Jo\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b.\u0010,¨\u00062"}, d2 = {"LDg0/d;", "", "", "throttleTime", "", "sizeBuckets", "", "LDg0/b;", "featureFlags", "LDg0/d$b;", "connectionRestoredPolicy", "", "successLoadValidTimeMs", "cancelRequestValidTimeMs", "maxDiskCacheSizeInBytes", "<init>", "(Ljava/lang/Integer;Ljava/util/Set;Ljava/util/List;LDg0/d$b;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "(Ljava/lang/Integer;Ljava/util/Set;Ljava/util/List;)V", "copy", "(Ljava/lang/Integer;Ljava/util/Set;Ljava/util/List;)LDg0/d;", "copyWithValidTimes", "(Ljava/lang/Long;Ljava/lang/Long;)LDg0/d;", "copy$debug_menu_shared_release", "(Ljava/lang/Integer;Ljava/util/Set;Ljava/util/List;LDg0/d$b;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)LDg0/d;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getThrottleTime", "()Ljava/lang/Integer;", "Ljava/util/Set;", "getSizeBuckets", "()Ljava/util/Set;", "Ljava/util/List;", "getFeatureFlags", "()Ljava/util/List;", "LDg0/d$b;", "getConnectionRestoredPolicy", "()LDg0/d$b;", "Ljava/lang/Long;", "getSuccessLoadValidTimeMs", "()Ljava/lang/Long;", "getCancelRequestValidTimeMs", "getMaxDiskCacheSizeInBytes", "Companion", "b", "a", "debug-menu-shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    @NotNull
    private static final d Default;
    private final Long cancelRequestValidTimeMs;
    private final b connectionRestoredPolicy;
    private final List<Dg0.b> featureFlags;
    private final Long maxDiskCacheSizeInBytes;
    private final Set<Integer> sizeBuckets;
    private final Long successLoadValidTimeMs;
    private final Integer throttleTime;

    @j(generateAdapter = false)
    public interface b {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LDg0/d$b$a;", "LDg0/d$b;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "debug-menu-shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements b {
            public boolean equals(Object other) {
                return other instanceof a;
            }

            public int hashCode() {
                return N.b(a.class).hashCode();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"LDg0/d$b$b;", "LDg0/d$b;", "", "count", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getCount", "debug-menu-shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Dg0.d$b$b, reason: collision with other inner class name */
        public static final class C0141b implements b {
            private final int count;

            public C0141b(int i11) {
                this.count = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C0141b) && this.count == ((C0141b) other).count;
            }

            public final int getCount() {
                return this.count;
            }

            public int hashCode() {
                return this.count;
            }
        }
    }

    static {
        Xc.a<a> a11 = a.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator<E> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dg0.b((a) it.next(), false));
        }
        Default = new d(null, null, arrayList, null, null, null, null, 112, null);
    }

    public d(Integer num, Set<Integer> set, List<Dg0.b> list, b bVar, Long l11, Long l12, Long l13) {
        this.throttleTime = num;
        this.sizeBuckets = set;
        this.featureFlags = list;
        this.connectionRestoredPolicy = bVar;
        this.successLoadValidTimeMs = l11;
        this.cancelRequestValidTimeMs = l12;
        this.maxDiskCacheSizeInBytes = l13;
    }

    public static /* synthetic */ d copy$debug_menu_shared_release$default(d dVar, Integer num, Set set, List list, b bVar, Long l11, Long l12, Long l13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = dVar.throttleTime;
        }
        if ((i11 & 2) != 0) {
            set = dVar.sizeBuckets;
        }
        if ((i11 & 4) != 0) {
            list = dVar.featureFlags;
        }
        if ((i11 & 8) != 0) {
            bVar = dVar.connectionRestoredPolicy;
        }
        if ((i11 & 16) != 0) {
            l11 = dVar.successLoadValidTimeMs;
        }
        if ((i11 & 32) != 0) {
            l12 = dVar.cancelRequestValidTimeMs;
        }
        if ((i11 & 64) != 0) {
            l13 = dVar.maxDiskCacheSizeInBytes;
        }
        Long l14 = l12;
        Long l15 = l13;
        Long l16 = l11;
        List list2 = list;
        return dVar.copy$debug_menu_shared_release(num, set, list2, bVar, l16, l14, l15);
    }

    public static /* synthetic */ d copy$default(d dVar, Integer num, Set set, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = dVar.throttleTime;
        }
        if ((i11 & 2) != 0) {
            set = dVar.sizeBuckets;
        }
        if ((i11 & 4) != 0) {
            list = dVar.featureFlags;
        }
        return dVar.copy(num, set, list);
    }

    public static /* synthetic */ d copyWithValidTimes$default(d dVar, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = dVar.successLoadValidTimeMs;
        }
        if ((i11 & 2) != 0) {
            l12 = dVar.cancelRequestValidTimeMs;
        }
        return dVar.copyWithValidTimes(l11, l12);
    }

    @InterfaceC3999a
    public final /* synthetic */ d copy(Integer throttleTime, Set sizeBuckets, List featureFlags) {
        return copy$debug_menu_shared_release$default(this, throttleTime, sizeBuckets, featureFlags, null, null, null, null, 120, null);
    }

    @NotNull
    public final d copy$debug_menu_shared_release(Integer throttleTime, Set<Integer> sizeBuckets, List<Dg0.b> featureFlags, b connectionRestoredPolicy, Long successLoadValidTimeMs, Long cancelRequestValidTimeMs, Long maxDiskCacheSizeInBytes) {
        return new d(throttleTime, sizeBuckets, featureFlags, connectionRestoredPolicy, successLoadValidTimeMs, cancelRequestValidTimeMs, maxDiskCacheSizeInBytes);
    }

    @NotNull
    public final d copyWithValidTimes(Long successLoadValidTimeMs, Long cancelRequestValidTimeMs) {
        return copy$debug_menu_shared_release$default(this, null, null, null, null, successLoadValidTimeMs, cancelRequestValidTimeMs, null, 79, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!d.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.pikazon.debug.menu.shared.config.PikazonInternalConfig");
        d dVar = (d) other;
        return Intrinsics.d(this.throttleTime, dVar.throttleTime) && Intrinsics.d(this.successLoadValidTimeMs, dVar.successLoadValidTimeMs) && Intrinsics.d(this.cancelRequestValidTimeMs, dVar.cancelRequestValidTimeMs) && Intrinsics.d(this.maxDiskCacheSizeInBytes, dVar.maxDiskCacheSizeInBytes) && Intrinsics.d(this.sizeBuckets, dVar.sizeBuckets) && Intrinsics.d(this.featureFlags, dVar.featureFlags) && Intrinsics.d(this.connectionRestoredPolicy, dVar.connectionRestoredPolicy);
    }

    public final Long getCancelRequestValidTimeMs() {
        return this.cancelRequestValidTimeMs;
    }

    public final b getConnectionRestoredPolicy() {
        return this.connectionRestoredPolicy;
    }

    public final List<Dg0.b> getFeatureFlags() {
        return this.featureFlags;
    }

    public final Long getMaxDiskCacheSizeInBytes() {
        return this.maxDiskCacheSizeInBytes;
    }

    public final Set<Integer> getSizeBuckets() {
        return this.sizeBuckets;
    }

    public final Long getSuccessLoadValidTimeMs() {
        return this.successLoadValidTimeMs;
    }

    public final Integer getThrottleTime() {
        return this.throttleTime;
    }

    public int hashCode() {
        Integer num = this.throttleTime;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Long l11 = this.successLoadValidTimeMs;
        int hashCode = (intValue + (l11 != null ? l11.hashCode() : 0)) * 31;
        Long l12 = this.cancelRequestValidTimeMs;
        int hashCode2 = (hashCode + (l12 != null ? l12.hashCode() : 0)) * 31;
        Long l13 = this.maxDiskCacheSizeInBytes;
        int hashCode3 = (hashCode2 + (l13 != null ? l13.hashCode() : 0)) * 31;
        Set<Integer> set = this.sizeBuckets;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        List<Dg0.b> list = this.featureFlags;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        b bVar = this.connectionRestoredPolicy;
        return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.throttleTime;
        Set<Integer> set = this.sizeBuckets;
        List<Dg0.b> list = this.featureFlags;
        b bVar = this.connectionRestoredPolicy;
        Long l11 = this.successLoadValidTimeMs;
        Long l12 = this.cancelRequestValidTimeMs;
        Long l13 = this.maxDiskCacheSizeInBytes;
        StringBuilder sb2 = new StringBuilder("PikazonInternalConfig(throttleTime=");
        sb2.append(num);
        sb2.append(", sizeBuckets=");
        sb2.append(set);
        sb2.append(", featureFlags=");
        sb2.append(list);
        sb2.append(", connectionRestoredPolicy=");
        sb2.append(bVar);
        sb2.append(", successLoadValidTimeMs=");
        TY.a.e(sb2, l11, ", cancelRequestValidTimeMs=", l12, ", maxDiskCacheSizeInBytes=");
        return C3051a.d(sb2, l13, ")");
    }

    public /* synthetic */ d(Integer num, Set set, List list, b bVar, Long l11, Long l12, Long l13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, set, list, bVar, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : l12, (i11 & 64) != 0 ? null : l13);
    }

    @InterfaceC3999a
    public d(Integer num, Set<Integer> set, List<Dg0.b> list) {
        this(num, set, list, null, null, null, null, 112, null);
    }
}
