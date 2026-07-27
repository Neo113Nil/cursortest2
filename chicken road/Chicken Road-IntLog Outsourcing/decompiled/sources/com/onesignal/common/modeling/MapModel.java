package com.onesignal.common.modeling;

import g4.AbstractC0465j;
import g4.AbstractC0467l;
import h4.C0487e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import u4.InterfaceC1481a;
import u4.InterfaceC1484d;

/* loaded from: classes.dex */
public class MapModel<V> extends Model implements Map<String, V>, InterfaceC1484d {
    /* JADX WARN: Multi-variable type inference failed */
    public MapModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.Map
    public void clear() {
        Iterator<String> it = getData().keySet().iterator();
        while (it.hasNext()) {
            Model.setOptAnyProperty$default(this, it.next(), null, null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(V v4) {
        return getData().containsValue(v4);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ V get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public Set<Map.Entry<String, V>> getEntries() {
        Set<Map.Entry<String, Object>> entrySet = getData().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if ((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC1481a) || (obj instanceof C0487e))) {
                arrayList.add(obj);
            }
        }
        return AbstractC0465j.W0(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<V> getValues() {
        Collection<Object> values = getData().values();
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return AbstractC0465j.U0(arrayList);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getData().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        return put2(str, (String) obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends V> from) {
        i.e(from, "from");
        for (Map.Entry<? extends String, ? extends V> entry : from.entrySet()) {
            Model.setOptAnyProperty$default(this, entry.getKey(), entry.getValue(), null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ V remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public /* synthetic */ MapModel(Model model, String str, int i2, e eVar) {
        this((i2 & 1) != 0 ? null : model, (i2 & 2) != 0 ? null : str);
    }

    public boolean containsKey(String key) {
        i.e(key, "key");
        return getData().containsKey(key);
    }

    public V get(String key) {
        i.e(key, "key");
        return (V) Model.getOptAnyProperty$default(this, key, null, 2, null);
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(String key, V v4) {
        i.e(key, "key");
        Model.setOptAnyProperty$default(this, key, v4, null, false, 12, null);
        return v4;
    }

    public V remove(String key) {
        i.e(key, "key");
        V v4 = (V) Model.getOptAnyProperty$default(this, key, null, 2, null);
        Model.setOptAnyProperty$default(this, key, null, null, false, 12, null);
        return v4;
    }

    public MapModel(Model model, String str) {
        super(model, str);
    }
}
