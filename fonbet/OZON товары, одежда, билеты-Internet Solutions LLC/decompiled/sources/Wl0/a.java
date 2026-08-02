package Wl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.rustore.sdk.pushclient.internal.domain.interactor.DeletePushTokenIfClientModeChangedInteractor", f = "DeletePushTokenIfClientModeChangedInteractor.kt", l = {14, 16}, m = "invoke")
/* loaded from: classes8.dex */
public final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    public b f33893d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f33894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f33895f;

    /* renamed from: g, reason: collision with root package name */
    public int f33896g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f33895f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33894e = obj;
        this.f33896g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f33895f.a(this);
    }
}
