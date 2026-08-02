package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface NoVarySearchDataBoundaryInterface {
    java.util.List<java.lang.String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    java.util.List<java.lang.String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
