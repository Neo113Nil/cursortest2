package com.applovin.mediation;

import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import java.util.List;

/* loaded from: classes.dex */
public interface MaxSegmentCollection {

    public interface Builder {
        Builder addSegment(MaxSegment maxSegment);

        MaxSegmentCollection build();
    }

    static Builder builder() {
        return new MaxSegmentCollectionImpl.BuilderImpl();
    }

    List<MaxSegment> getSegments();
}
