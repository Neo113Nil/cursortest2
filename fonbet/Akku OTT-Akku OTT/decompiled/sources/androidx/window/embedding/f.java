package androidx.window.embedding;

import androidx.window.embedding.EmbeddingCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Unit emptyActivityEmbeddingProxy$lambda$2;
        emptyActivityEmbeddingProxy$lambda$2 = EmbeddingCompat.Companion.emptyActivityEmbeddingProxy$lambda$2(obj, method, objArr);
        return emptyActivityEmbeddingProxy$lambda$2;
    }
}
