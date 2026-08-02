package V70;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.recordaudio.domain.AudioRecordInteractorImpl", f = "AudioRecordInteractorImpl.kt", l = {138}, m = "saveChunk")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f28396d;

    /* renamed from: e, reason: collision with root package name */
    boolean f28397e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f28398f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f28399g;

    /* renamed from: h, reason: collision with root package name */
    int f28400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28399g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28398f = obj;
        this.f28400h |= LinearLayoutManager.INVALID_OFFSET;
        return d.l(this.f28399g, 0L, false, this);
    }
}
