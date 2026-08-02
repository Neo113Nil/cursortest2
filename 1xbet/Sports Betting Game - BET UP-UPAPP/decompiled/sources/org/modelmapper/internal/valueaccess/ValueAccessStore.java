package org.modelmapper.internal.valueaccess;

import java.util.List;
import org.modelmapper.internal.TypeResolvingList;
import org.modelmapper.spi.ValueReader;

/* loaded from: classes4.dex */
public final class ValueAccessStore {
    private final TypeResolvingList<ValueReader<?>> valueReaders;

    public ValueAccessStore() {
        TypeResolvingList<ValueReader<?>> typeResolvingList = new TypeResolvingList<>(ValueReader.class);
        this.valueReaders = typeResolvingList;
        typeResolvingList.add(new MapValueReader());
    }

    public <T> ValueReader<T> getFirstSupportedReader(Class<T> cls) {
        return (ValueReader) this.valueReaders.first(cls);
    }

    public List<ValueReader<?>> getValueReaders() {
        return this.valueReaders;
    }
}
