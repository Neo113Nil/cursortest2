package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public abstract class SimpleTest implements org.bouncycastle.util.test.Test {
    @Override // org.bouncycastle.util.test.Test
    public abstract java.lang.String getName();

    public abstract void performTest() throws java.lang.Exception;

    @Override // org.bouncycastle.util.test.Test
    public org.bouncycastle.util.test.TestResult perform() {
        try {
            performTest();
            return org.bouncycastle.util.test.SimpleTestResult.successful(this, "Okay");
        } catch (org.bouncycastle.util.test.TestFailedException e) {
            return e.getResult();
        } catch (java.lang.Exception e2) {
            return org.bouncycastle.util.test.SimpleTestResult.failed(this, "Exception: ".concat(java.lang.String.valueOf(e2)), e2);
        }
    }

    protected void isTrue(boolean z) {
        if (!z) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, "no message"));
        }
    }

    protected void isTrue(java.lang.String str, boolean z) {
        if (!z) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
        }
    }

    protected void isEquals(java.lang.String str, boolean z, boolean z2) {
        if (z != z2) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
        }
    }

    protected void isEquals(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
        }
        if (obj2 == null) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
        }
        if (!obj.equals(obj2)) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
        }
    }

    protected void isEquals(java.lang.String str, long j, long j2) {
        if (j != j2) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
        }
    }

    protected void isEquals(java.lang.Object obj, java.lang.Object obj2) {
        if (!obj.equals(obj2)) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, "no message"));
        }
    }

    protected void isEquals(long j, long j2) {
        if (j != j2) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, "no message"));
        }
    }

    protected void isEquals(int i, int i2) {
        if (i != i2) {
            throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, "no message"));
        }
    }

    protected void fail(java.lang.String str, java.lang.Throwable th) {
        throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str, th));
    }

    protected void fail(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str, obj, obj2));
    }

    protected void fail(java.lang.String str) {
        throw new org.bouncycastle.util.test.TestFailedException(org.bouncycastle.util.test.SimpleTestResult.failed(this, str));
    }

    protected boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (!areEqual(bArr[i], bArr2[i])) {
                return false;
            }
        }
        return true;
    }

    protected boolean areEqual(byte[] bArr, byte[] bArr2) {
        return org.bouncycastle.util.Arrays.areEqual(bArr, bArr2);
    }

    protected boolean areEqual(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        return org.bouncycastle.util.Arrays.areEqual(bArr, i, i2, bArr2, i3, i4);
    }

    public static void runTests(org.bouncycastle.util.test.Test[] testArr, java.io.PrintStream printStream) {
        java.util.Vector vector = new java.util.Vector();
        for (int i = 0; i != testArr.length; i++) {
            org.bouncycastle.util.test.TestResult perform = testArr[i].perform();
            if (!perform.isSuccessful()) {
                vector.addElement(perform);
            }
            if (perform.getException() != null) {
                perform.getException().printStackTrace(printStream);
            }
            printStream.println(perform);
        }
        printStream.println("-----");
        if (vector.isEmpty()) {
            printStream.println("All tests successful.");
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed with ");
        sb.append(vector.size());
        sb.append(" FAILURES:");
        printStream.println(sb.toString());
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            java.io.PrintStream printStream2 = java.lang.System.out;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("=>  ");
            sb2.append((org.bouncycastle.util.test.TestResult) elements.nextElement());
            printStream2.println(sb2.toString());
        }
    }

    public static void runTests(org.bouncycastle.util.test.Test[] testArr) {
        runTests(testArr, java.lang.System.out);
    }

    public static void runTest(org.bouncycastle.util.test.Test test, java.io.PrintStream printStream) {
        org.bouncycastle.util.test.TestResult perform = test.perform();
        if (perform.getException() != null) {
            perform.getException().printStackTrace(printStream);
        }
        printStream.println(perform);
    }

    public static void runTest(org.bouncycastle.util.test.Test test) {
        runTest(test, java.lang.System.out);
    }
}
