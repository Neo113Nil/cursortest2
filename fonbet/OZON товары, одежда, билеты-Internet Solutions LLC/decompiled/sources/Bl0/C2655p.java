package Bl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Bl0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2655p extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2655p(String str) {
        super(0);
        this.f3989b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Delete id's from storage " + this.f3989b;
    }
}
