package defpackage;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.navigationevent.OnBackCompletedFallback;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.UnsafeAllocator;
import com.google.gson.internal.reflect.ReflectionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class AQjFgAcRSdD7Ysn implements TextFieldState.NotifyImeListener, ObjectConstructor, OnBackCompletedFallback, ObserverHandle {
    public final /* synthetic */ Object hRNgd2zGCE5kj;
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ AQjFgAcRSdD7Ysn(int i, Object obj) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object oyjLVtGms9eZwJ0() {
        int i = this.yzPsTade5rL7D3;
        Object obj = this.hRNgd2zGCE5kj;
        switch (i) {
            case 1:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.yzPsTade5rL7D3;
                    h1.NIabVTHf6LMJyXq("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.hRNgd2zGCE5kj(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    h1.NIabVTHf6LMJyXq("Failed to invoke constructor '" + ReflectionHelper.hRNgd2zGCE5kj(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return UnsafeAllocator.yzPsTade5rL7D3.yzPsTade5rL7D3(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public void yzPsTade5rL7D3() {
        Function2 function2 = (Function2) this.hRNgd2zGCE5kj;
        synchronized (SnapshotKt.ra306ClFT3HT) {
            List list = SnapshotKt.Uo5pffGf8LUU;
            list.getClass();
            ArrayList arrayList = new ArrayList(CollectionsKt.NIabVTHf6LMJyXq(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && Intrinsics.yzPsTade5rL7D3(obj, function2)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            SnapshotKt.Uo5pffGf8LUU = arrayList;
        }
    }
}
