package Oi;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.files.OzMediaFileManagerImpl", f = "OzMediaFileManager.kt", l = {206}, m = "getMediaByUri")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f20401d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f20402e;

    /* renamed from: f, reason: collision with root package name */
    int f20403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f20402e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20401d = obj;
        this.f20403f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20402e.e(null, this);
    }
}
