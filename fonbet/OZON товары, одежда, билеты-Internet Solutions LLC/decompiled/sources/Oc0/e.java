package Oc0;

import Fb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import com.squareup.moshi.Moshi;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import jc0.AbstractC7345h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xd0.C10708a;

/* loaded from: classes3.dex */
public final class e extends AbstractC7345h {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f20206d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f20207e;

    static final class a extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f20210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f20211e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Oc0.a f20212f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, long j12, Integer num, e eVar, Oc0.a aVar) {
            super(1);
            this.f20208b = j11;
            this.f20209c = j12;
            this.f20210d = num;
            this.f20211e = eVar;
            this.f20212f = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> addPayload = map;
            Intrinsics.checkNotNullParameter(addPayload, "$this$addPayload");
            long j11 = this.f20208b;
            long j12 = this.f20209c;
            addPayload.put("custom_dimension3", String.valueOf(j11 - j12));
            Integer num = this.f20210d;
            if (num != null) {
                addPayload.put("reason", String.valueOf(num.intValue()));
            }
            e eVar = this.f20211e;
            addPayload.put("status", Sh.b.c("start:", e.f(eVar, j12), " finish:", e.f(eVar, j11)));
            Oc0.a aVar = this.f20212f;
            addPayload.put("custom_dimension7", aVar.c() + "=" + aVar.e());
            addPayload.put("custom_dimension6", aVar.b().a());
            if (aVar.c()) {
                Boolean b11 = e.e(eVar).b();
                if (b11 != null) {
                    addPayload.put("custom_dimension4", String.valueOf(b11.booleanValue()));
                }
                String a11 = e.e(eVar).a();
                if (a11 != null) {
                    addPayload.put("custom_dimension5", a11);
                }
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<SimpleDateFormat> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20213b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.US);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull f ozonIdConfig, @NotNull InterfaceC4008j<Moshi> moshi, @NotNull InterfaceC4008j<C10708a> cellularUtils) {
        super(ozonIdConfig, moshi);
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(cellularUtils, "cellularUtils");
        this.f20206d = cellularUtils;
        this.f20207e = k.b(b.f20213b);
    }

    public static final C10708a e(e eVar) {
        return (C10708a) eVar.f20206d.getValue();
    }

    public static final String f(e eVar, long j11) {
        return ((SimpleDateFormat) eVar.f20207e.getValue()).format(Long.valueOf(j11));
    }

    @NotNull
    public final String g(@NotNull String trackingAction, long j11, long j12, Integer num, @NotNull Oc0.a mobileIdContainer) {
        Intrinsics.checkNotNullParameter(trackingAction, "trackingAction");
        Intrinsics.checkNotNullParameter(mobileIdContainer, "mobileIdContainer");
        return b(trackingAction, new a(j12, j11, num, this, mobileIdContainer));
    }
}
