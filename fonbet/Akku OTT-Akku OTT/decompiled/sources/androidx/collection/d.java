package androidx.collection;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import com.facebook.F;
import com.facebook.G;
import com.facebook.internal.C0715k;
import com.facebook.internal.u;
import com.facebook.w;
import com.facebook.z;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import kotlin.ExceptionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Consumer, C0715k.a {
    public static FieldDescriptor a(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    public static void c(int i, int i2, Function1 function1) {
        function1.invoke(Integer.valueOf(i + i2));
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            String str = com.facebook.appevents.cloudbridge.d.b;
            G g = G.d;
            try {
                z zVar = new z(null, w.b().concat("/cloudbridge_settings"), null, F.a, new com.facebook.appevents.cloudbridge.c(), 32);
                u.a aVar = u.Companion;
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
                aVar.getClass();
                u.a.b(g, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", zVar);
                zVar.d();
            } catch (JSONException e) {
                u.a aVar2 = u.Companion;
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
                Object[] objArr = {ExceptionsKt.stackTraceToString(e)};
                aVar2.getClass();
                u.a.b(g, str, " \n\nGraph Request Exception: \n=============\n%s\n\n ", objArr);
            }
        }
    }
}
