package androidx.compose.ui.platform;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "startInputMethod")
/* renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5250h0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f40879d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5262l0 f40880e;

    /* renamed from: f, reason: collision with root package name */
    int f40881f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5250h0(C5262l0 c5262l0, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f40880e = c5262l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40879d = obj;
        this.f40881f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f40880e.a(null, this);
    }
}
