package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {23, 24, DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "checkForUndeliveredPushToken")
/* loaded from: classes8.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public f f36016d;

    /* renamed from: e, reason: collision with root package name */
    public String f36017e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f36019g;

    /* renamed from: h, reason: collision with root package name */
    public int f36020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36019g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36018f = obj;
        this.f36020h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36019g.d(this);
    }
}
