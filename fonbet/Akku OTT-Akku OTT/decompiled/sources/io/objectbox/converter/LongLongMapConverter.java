package io.objectbox.converter;

import io.objectbox.flatbuffers.e;

/* loaded from: classes3.dex */
public class LongLongMapConverter extends LongFlexMapConverter {
    @Override // io.objectbox.converter.FlexObjectConverter
    public boolean shouldRestoreAsLong(e.g gVar) {
        return true;
    }
}
