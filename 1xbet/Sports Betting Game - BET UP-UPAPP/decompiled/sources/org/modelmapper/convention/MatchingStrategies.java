package org.modelmapper.convention;

import org.modelmapper.spi.MatchingStrategy;

/* loaded from: classes4.dex */
public class MatchingStrategies {
    public static final MatchingStrategy LOOSE = new LooseMatchingStrategy();
    public static final MatchingStrategy STANDARD = new StandardMatchingStrategy();
    public static final MatchingStrategy STRICT = new StrictMatchingStrategy();
}
