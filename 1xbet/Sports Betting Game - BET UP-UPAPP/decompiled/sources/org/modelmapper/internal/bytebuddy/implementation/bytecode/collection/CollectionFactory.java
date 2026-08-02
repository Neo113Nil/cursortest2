package org.modelmapper.internal.bytebuddy.implementation.bytecode.collection;

import java.util.List;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes4.dex */
public interface CollectionFactory {
    TypeDescription.Generic getComponentType();

    StackManipulation withValues(List<? extends StackManipulation> list);
}
