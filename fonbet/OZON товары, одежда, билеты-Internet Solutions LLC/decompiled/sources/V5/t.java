package V5;

import V5.i;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class t<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final x2.f<List<Throwable>> f28291a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends j<Data, ResourceType, Transcode>> f28292b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28293c;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, x2.f<List<Throwable>> fVar) {
        this.f28291a = fVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f28292b = list;
        this.f28293c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final v a(int i11, int i12, @NonNull T5.i iVar, i.b bVar, com.bumptech.glide.load.data.e eVar) throws q {
        x2.f<List<Throwable>> fVar = this.f28291a;
        List<Throwable> a11 = fVar.a();
        p6.k.c(a11, "Argument must not be null");
        List<Throwable> list = a11;
        try {
            List<? extends j<Data, ResourceType, Transcode>> list2 = this.f28292b;
            int size = list2.size();
            v vVar = null;
            for (int i13 = 0; i13 < size; i13++) {
                try {
                    vVar = list2.get(i13).a(i11, i12, iVar, bVar, eVar);
                } catch (q e11) {
                    list.add(e11);
                }
                if (vVar != null) {
                    break;
                }
            }
            if (vVar != null) {
                return vVar;
            }
            throw new q(this.f28293c, new ArrayList(list));
        } finally {
            fVar.b(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f28292b.toArray()) + '}';
    }
}
