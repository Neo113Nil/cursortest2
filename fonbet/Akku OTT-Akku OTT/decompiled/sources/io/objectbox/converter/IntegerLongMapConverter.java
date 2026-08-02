package io.objectbox.converter;

import io.objectbox.flatbuffers.e;

/* loaded from: classes3.dex */
public class IntegerLongMapConverter extends IntegerFlexMapConverter {
    @Override // io.objectbox.converter.FlexObjectConverter
    public boolean shouldRestoreAsLong(e.g gVar) {
        return true;
    }
}
