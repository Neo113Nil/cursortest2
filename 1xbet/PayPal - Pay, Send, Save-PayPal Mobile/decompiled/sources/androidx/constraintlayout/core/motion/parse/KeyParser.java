package androidx.constraintlayout.core.motion.parse;

/* loaded from: classes6.dex */
public class KeyParser {

    interface DataType {
        int get(int i);
    }

    interface Ids {
        int get(java.lang.String str);
    }

    private static androidx.constraintlayout.core.motion.utils.TypedBundle Camera2StreamConfigurationMap(java.lang.String str, androidx.constraintlayout.core.motion.parse.KeyParser.Ids ids, androidx.constraintlayout.core.motion.parse.KeyParser.DataType dataType) {
        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
        try {
            androidx.constraintlayout.core.parser.CLObject parse = androidx.constraintlayout.core.parser.CLParser.parse(str);
            int size = parse.size();
            for (int i = 0; i < size; i++) {
                androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) parse.get(i);
                java.lang.String content = cLKey.content();
                androidx.constraintlayout.core.parser.CLElement value = cLKey.getValue();
                int i2 = ids.get(content);
                if (i2 == -1) {
                    java.io.PrintStream printStream = java.lang.System.err;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("unknown type ");
                    sb.append(content);
                    printStream.println(sb.toString());
                } else {
                    int i3 = dataType.get(i2);
                    if (i3 == 1) {
                        typedBundle.add(i2, parse.getBoolean(i));
                    } else if (i3 == 2) {
                        typedBundle.add(i2, value.getInt());
                        java.io.PrintStream printStream2 = java.lang.System.out;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("parse ");
                        sb2.append(content);
                        sb2.append(" INT_MASK > ");
                        sb2.append(value.getInt());
                        printStream2.println(sb2.toString());
                    } else if (i3 == 4) {
                        typedBundle.add(i2, value.getFloat());
                        java.io.PrintStream printStream3 = java.lang.System.out;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append("parse ");
                        sb3.append(content);
                        sb3.append(" FLOAT_MASK > ");
                        sb3.append(value.getFloat());
                        printStream3.println(sb3.toString());
                    } else if (i3 == 8) {
                        typedBundle.add(i2, value.content());
                        java.io.PrintStream printStream4 = java.lang.System.out;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append("parse ");
                        sb4.append(content);
                        sb4.append(" STRING_MASK > ");
                        sb4.append(value.content());
                        printStream4.println(sb4.toString());
                    }
                }
            }
            return typedBundle;
        } catch (androidx.constraintlayout.core.parser.CLParsingException e) {
            java.io.PrintStream printStream5 = java.lang.System.err;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(e.toString());
            sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb5.append(java.util.Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream5.println(sb5.toString());
            return typedBundle;
        }
    }

    public static androidx.constraintlayout.core.motion.utils.TypedBundle parseAttributes(java.lang.String str) {
        return Camera2StreamConfigurationMap(str, new androidx.constraintlayout.core.motion.parse.KeyParser.Ids() { // from class: androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(java.lang.String str2) {
                return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(str2);
            }
        }, new androidx.constraintlayout.core.motion.parse.KeyParser.DataType() { // from class: androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda1
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i) {
                return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getType(i);
            }
        });
    }

    public static void main(java.lang.String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }
}
