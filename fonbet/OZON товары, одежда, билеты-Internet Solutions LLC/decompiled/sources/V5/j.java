package V5;

import V5.i;
import android.util.Log;
import androidx.annotation.NonNull;
import h6.InterfaceC6817e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f28199a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends T5.k<DataType, ResourceType>> f28200b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6817e<ResourceType, Transcode> f28201c;

    /* renamed from: d, reason: collision with root package name */
    private final x2.f<List<Throwable>> f28202d;

    /* renamed from: e, reason: collision with root package name */
    private final String f28203e;

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends T5.k<DataType, ResourceType>> list, InterfaceC6817e<ResourceType, Transcode> interfaceC6817e, x2.f<List<Throwable>> fVar) {
        this.f28199a = cls;
        this.f28200b = list;
        this.f28201c = interfaceC6817e;
        this.f28202d = fVar;
        this.f28203e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull T5.i iVar, List<Throwable> list) throws q {
        List<? extends T5.k<DataType, ResourceType>> list2 = this.f28200b;
        int size = list2.size();
        v<ResourceType> vVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            T5.k<DataType, ResourceType> kVar = list2.get(i13);
            try {
                if (kVar.a(eVar.a(), iVar)) {
                    vVar = kVar.b(eVar.a(), i11, i12, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e11);
                }
                list.add(e11);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f28203e, new ArrayList(list));
    }

    public final v a(int i11, int i12, @NonNull T5.i iVar, i.b bVar, com.bumptech.glide.load.data.e eVar) throws q {
        x2.f<List<Throwable>> fVar = this.f28202d;
        List<Throwable> a11 = fVar.a();
        p6.k.c(a11, "Argument must not be null");
        List<Throwable> list = a11;
        try {
            v<ResourceType> b11 = b(eVar, i11, i12, iVar, list);
            fVar.b(list);
            return this.f28201c.a(bVar.a(b11), iVar);
        } catch (Throwable th2) {
            fVar.b(list);
            throw th2;
        }
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f28199a + ", decoders=" + this.f28200b + ", transcoder=" + this.f28201c + '}';
    }
}
