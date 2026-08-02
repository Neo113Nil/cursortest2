package Ll0;

import com.vk.push.common.messaging.RemoteMessage;
import fb.InterfaceC6490a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b implements InterfaceC6490a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f17148a = new ArrayList();

    @Override // fb.InterfaceC6490a
    public final boolean a(@NotNull RemoteMessage remoteMessage) {
        Object obj;
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        synchronized (this) {
            try {
                ArrayList arrayList = this.f17148a;
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boolean.valueOf(((InterfaceC6490a) it.next()).a(remoteMessage)));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = Boolean.valueOf(((Boolean) next).booleanValue() | ((Boolean) it2.next()).booleanValue());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                booleanValue = bool != null ? bool.booleanValue() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }
}
