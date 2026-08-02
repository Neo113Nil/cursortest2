package org.modelmapper.internal.valuemutate;

import java.util.List;
import org.modelmapper.internal.TypeResolvingList;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
public final class ValueMutateStore {
    private final TypeResolvingList<ValueWriter<?>> valueWriters;

    public ValueMutateStore() {
        TypeResolvingList<ValueWriter<?>> typeResolvingList = new TypeResolvingList<>(ValueWriter.class);
        this.valueWriters = typeResolvingList;
        typeResolvingList.add(new MapValueWriter());
    }

    public <T> ValueWriter<T> getFirstSupportedWriter(Class<T> cls) {
        return (ValueWriter) this.valueWriters.first(cls);
    }

    public List<ValueWriter<?>> getValueWriters() {
        return this.valueWriters;
    }
}
