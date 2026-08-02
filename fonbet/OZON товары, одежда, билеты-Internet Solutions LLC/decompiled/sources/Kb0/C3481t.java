package Kb0;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3481t extends AbstractC7737t implements Function0<File> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3483u f15731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3481t(C3483u c3483u) {
        super(0);
        this.f15731b = c3483u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        return V2.c.a(this.f15731b.f15733a.m(), "OZON_ID_DATASTORE");
    }
}
