package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentActivity$activityResultRegistry$1;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.core.os.BundleKt;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.os.SavedStateRegistry;
import com.door.brass.knob.Hilt_MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ Object hRNgd2zGCE5kj;
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ a0(int i, Object obj) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle yzPsTade5rL7D3() {
        Pair[] pairArr;
        int i = this.yzPsTade5rL7D3;
        Object obj = this.hRNgd2zGCE5kj;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.XrorSzThrtvJ4A;
                Bundle bundle = new Bundle();
                ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1 = ((Hilt_MainActivity) obj).MRfxZSx8l5UG62U;
                componentActivity$activityResultRegistry$1.getClass();
                LinkedHashMap linkedHashMap = componentActivity$activityResultRegistry$1.hRNgd2zGCE5kj;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(componentActivity$activityResultRegistry$1.ra306ClFT3HT));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(componentActivity$activityResultRegistry$1.gmXBnHsR2YSm));
                return bundle;
            case 1:
                Map b41X89IqSbKt = ((SaveableStateRegistry) obj).b41X89IqSbKt();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : b41X89IqSbKt.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                SavedStateHandleImpl savedStateHandleImpl = (SavedStateHandleImpl) obj;
                for (Map.Entry entry2 : MapsKt.FsuUJlzzWhYnMlD(savedStateHandleImpl.oyjLVtGms9eZwJ0).entrySet()) {
                    savedStateHandleImpl.yzPsTade5rL7D3(((MutableStateFlow) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : MapsKt.FsuUJlzzWhYnMlD(savedStateHandleImpl.hRNgd2zGCE5kj).entrySet()) {
                    savedStateHandleImpl.yzPsTade5rL7D3(((SavedStateRegistry.SavedStateProvider) entry3.getValue()).yzPsTade5rL7D3(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = savedStateHandleImpl.yzPsTade5rL7D3;
                if (linkedHashMap2.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
