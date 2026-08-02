package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class Debug {
    public static void logStack(java.lang.String str, java.lang.String str2, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int min = java.lang.Math.min(i, stackTrace.length - 1);
        for (int i2 = 1; i2 <= min; i2++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
        }
    }

    public static void printStack(java.lang.String str, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int min = java.lang.Math.min(i, stackTrace.length - 1);
        java.lang.String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
            sb.append(stackTrace[i2].getFileName());
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(stackTrace[i2].getLineNumber());
            sb.append(") ");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(" ");
            str2 = sb2.toString();
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(str2);
            sb3.append(obj);
            sb3.append(str2);
            printStream.println(sb3.toString());
        }
    }

    public static java.lang.String getName(android.view.View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (java.lang.Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void dumpPoc(java.lang.Object obj) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        java.lang.String obj2 = sb.toString();
        java.lang.Class<?> cls = obj.getClass();
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj2);
        sb2.append("------------- ");
        sb2.append(cls.getName());
        sb2.append(" --------------------");
        printStream.println(sb2.toString());
        for (java.lang.reflect.Field field : cls.getFields()) {
            try {
                java.lang.Object obj3 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj3 instanceof java.lang.Integer) || !obj3.toString().equals("-1")) && ((!(obj3 instanceof java.lang.Integer) || !obj3.toString().equals("0")) && ((!(obj3 instanceof java.lang.Float) || !obj3.toString().equals(com.caverock.androidsvg.BuildConfig.VERSION_NAME)) && (!(obj3 instanceof java.lang.Float) || !obj3.toString().equals("0.5")))))) {
                    java.io.PrintStream printStream2 = java.lang.System.out;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(obj2);
                    sb3.append("    ");
                    sb3.append(field.getName());
                    sb3.append(" ");
                    sb3.append(obj3);
                    printStream2.println(sb3.toString());
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        java.io.PrintStream printStream3 = java.lang.System.out;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj2);
        sb4.append("------------- ");
        sb4.append(cls.getSimpleName());
        sb4.append(" --------------------");
        printStream3.println(sb4.toString());
    }

    public static java.lang.String getName(android.content.Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (java.lang.Exception unused) {
                return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION.concat(java.lang.String.valueOf(i));
            }
        }
        return "UNKNOWN";
    }

    public static java.lang.String getName(android.content.Context context, int[] iArr) {
        java.lang.String obj;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(iArr.length);
            sb.append("[");
            java.lang.String obj2 = sb.toString();
            int i = 0;
            while (i < iArr.length) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj2);
                sb2.append(i == 0 ? "" : " ");
                java.lang.String obj3 = sb2.toString();
                try {
                    obj = context.getResources().getResourceEntryName(iArr[i]);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append("? ");
                    sb3.append(iArr[i]);
                    sb3.append(" ");
                    obj = sb3.toString();
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(obj3);
                sb4.append(obj);
                obj2 = sb4.toString();
                i++;
            }
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(obj2);
            sb5.append("]");
            return sb5.toString();
        } catch (java.lang.Exception unused2) {
            return "UNKNOWN";
        }
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        return getState(motionLayout, i, -1);
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        java.lang.String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        int length2 = (resourceEntryName.length() - i2) / length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.nio.CharBuffer.allocate(length2).toString().replace((char) 0, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR));
        sb.append("_");
        return resourceEntryName.replaceAll(sb.toString(), "_");
    }

    public static java.lang.String getActionType(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (java.lang.reflect.Field field : android.view.MotionEvent.class.getFields()) {
            try {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getType().equals(java.lang.Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static java.lang.String getLocation() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static java.lang.String getLoc() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        sb.append("()");
        return sb.toString();
    }

    public static java.lang.String getLocation2() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[2];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static java.lang.String getCallFrom(int i) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[i + 2];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static void dumpLayoutParams(android.view.ViewGroup viewGroup, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        java.lang.String obj = sb.toString();
        int childCount = viewGroup.getChildCount();
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" children ");
        sb2.append(childCount);
        printStream.println(sb2.toString());
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            java.io.PrintStream printStream2 = java.lang.System.out;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append("     ");
            sb3.append(getName(childAt));
            printStream2.println(sb3.toString());
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (java.lang.reflect.Field field : layoutParams.getClass().getFields()) {
                try {
                    java.lang.Object obj2 = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj2.toString().equals("-1")) {
                        java.io.PrintStream printStream3 = java.lang.System.out;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(obj);
                        sb4.append("       ");
                        sb4.append(field.getName());
                        sb4.append(" ");
                        sb4.append(obj2);
                        printStream3.println(sb4.toString());
                    }
                } catch (java.lang.IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpLayoutParams(android.view.ViewGroup.LayoutParams layoutParams, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        java.lang.String obj = sb.toString();
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" >>>>>>>>>>>>>>>>>>. dump ");
        sb2.append(obj);
        sb2.append("  ");
        sb2.append(layoutParams.getClass().getName());
        printStream.println(sb2.toString());
        for (java.lang.reflect.Field field : layoutParams.getClass().getFields()) {
            try {
                java.lang.Object obj2 = field.get(layoutParams);
                java.lang.String name2 = field.getName();
                if (name2.contains("To") && !obj2.toString().equals("-1")) {
                    java.io.PrintStream printStream2 = java.lang.System.out;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(obj);
                    sb3.append("       ");
                    sb3.append(name2);
                    sb3.append(" ");
                    sb3.append(obj2);
                    printStream2.println(sb3.toString());
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        java.lang.System.out.println(" <<<<<<<<<<<<<<<<< dump ".concat(java.lang.String.valueOf(obj)));
    }
}
