package Rh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25101b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25102c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f25103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(String str, String str2, boolean z11) {
        super(0);
        this.f25101b = str;
        this.f25102c = str2;
        this.f25103d = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("HW ids sent successfully without migration (hwId: ");
        sb2.append(this.f25101b);
        sb2.append(", oldHwId: ");
        sb2.append(this.f25102c);
        sb2.append(", isMigrationEnabled: ");
        return Pk0.a.a(").", sb2, this.f25103d);
    }
}
