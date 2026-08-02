package org.modelmapper.internal;

import java.util.List;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
interface InternalMapping extends Mapping {
    InternalMapping createMergedCopy(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2);

    boolean isExplicit();
}
