package m2;

import java.io.Serializable;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1283f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient j5.i f11159a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f11160b;

    public AbstractC1283f(AbstractC1286i adapter, j5.i unknownFields) {
        kotlin.jvm.internal.i.e(adapter, "adapter");
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        this.f11159a = unknownFields;
    }

    public final j5.i a() {
        j5.i iVar = this.f11159a;
        return iVar == null ? j5.i.f10496d : iVar;
    }
}
