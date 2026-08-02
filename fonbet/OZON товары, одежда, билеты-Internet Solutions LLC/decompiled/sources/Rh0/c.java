package Rh0;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<SharedPreferences.Editor, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<String> f25100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(M m11) {
        super(1);
        this.f25100b = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SharedPreferences.Editor editor) {
        SharedPreferences.Editor edit = editor;
        Intrinsics.checkNotNullParameter(edit, "$this$edit");
        edit.putString("app_instance_id", this.f25100b.f71787a);
        return Unit.f71690a;
    }
}
