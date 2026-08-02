package Rg0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.push.dialog.internal.domain.interactor.DialogInteractor", f = "DialogInteractor.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "shouldShowDialog")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f25089d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f25090e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f25091f;

    /* renamed from: g, reason: collision with root package name */
    int f25092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f25091f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f25090e = obj;
        this.f25092g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f25091f.h(this);
    }
}
