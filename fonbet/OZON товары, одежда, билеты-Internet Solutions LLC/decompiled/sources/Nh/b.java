package Nh;

import Q1.V;
import Sc.C4005g;
import com.google.android.gms.internal.gtm.zzto;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.d;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegateKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Continuation {
    public static int a(int i11, int i12, int i13) {
        return zzto.zzD(i11) + i12 + i13;
    }

    public static C4005g b(d dVar) {
        PreCreationViewPoolDelegateKt.unknownViewClassError(dVar);
        return new C4005g();
    }

    public static StringBuilder c(String str, long j11, String str2, ImageDTO imageDTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(imageDTO);
        return sb2;
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, V v11) {
        while (!atomicReference.compareAndSet(v11, null)) {
            if (atomicReference.get() != v11) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean e(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return 403;
    }
}
