package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class TestFailedException extends java.lang.RuntimeException {
    private org.bouncycastle.util.test.TestResult getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.util.test.TestResult getResult() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public TestFailedException(org.bouncycastle.util.test.TestResult testResult) {
        this.getHighResolutionOutputSizeshNQ4ISI = testResult;
    }
}
