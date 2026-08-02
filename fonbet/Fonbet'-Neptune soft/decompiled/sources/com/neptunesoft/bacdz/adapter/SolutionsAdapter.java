package com.neptunesoft.bacdz.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.TopicsSolutionsActivity;
import com.neptunesoft.bacdz.adapter.SolutionsAdapter;
import com.neptunesoft.bacdz.classobjects.Separate;
import com.neptunesoft.bacdz.classobjects.Solutions;
import com.neptunesoft.bacdz.fragment.SolutionsFragment;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class SolutionsAdapter extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static List list;
    static SolutionsHolder solutionsHolder;

    public SolutionsAdapter(List list2) {
        list = list2;
    }

    private static Solutions prepareSolutions(Solutions solutions) {
        if (SplashScreen.darkmode) {
            return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_startabinsidecircle_dark);
        }
        return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_startabinsidecircle);
    }

    public static void change() {
        Solutions prepareSolutions;
        switch (solutionsHolder.getBindingAdapterPosition()) {
            case 1:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 2:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 3:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 4:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 5:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 6:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 7:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 8:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 9:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 99:
            case 116:
            case 126:
            case Opcodes.L2I /* 136 */:
            case Opcodes.I2C /* 146 */:
            case 156:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            default:
                prepareSolutions = null;
                break;
            case 11:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 12:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 13:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 14:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 15:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 16:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 17:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 18:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 19:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 21:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 22:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 23:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 24:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 25:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 26:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 27:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 28:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 29:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 31:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 32:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 33:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 34:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 35:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 36:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 37:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 38:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 39:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 41:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 42:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 43:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 44:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 45:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 46:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 47:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 48:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 49:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 51:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 52:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 53:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 54:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 55:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 56:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 57:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 58:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 59:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 61:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 62:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 63:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 64:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 65:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 66:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 67:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 68:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 69:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 71:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 72:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 73:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 74:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 75:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 76:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 77:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 78:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 79:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 81:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 82:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 83:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 84:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 85:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 86:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 87:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0));
                break;
            case 88:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 89:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 90:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 91:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 92:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 93:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 94:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 95:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 96:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0));
                break;
            case 97:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 98:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 1", 0));
                break;
            case 100:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 101:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 102:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 103:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 104:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 105:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 106:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0));
                break;
            case 107:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 108:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 2", 0));
                break;
            case 109:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 110:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 111:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 112:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 113:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة المسربة", 0));
                break;
            case 114:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 115:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة المسربة", 0));
                break;
            case 117:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 118:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case 119:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 120:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case 121:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case 122:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 123:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 124:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 125:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 127:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 128:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LOR /* 129 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case 130:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LXOR /* 131 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IINC /* 132 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2L /* 133 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.I2F /* 134 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2D /* 135 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2F /* 137 */:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.L2D /* 138 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2I /* 139 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2L /* 140 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.F2D /* 141 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2I /* 142 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.D2L /* 143 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.D2F /* 144 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2B /* 145 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.I2S /* 147 */:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LCMP /* 148 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPL /* 149 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.FCMPG /* 150 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DCMPL /* 151 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DCMPG /* 152 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case 153:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case 154:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case 155:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case 157:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case 158:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPEQ /* 159 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPNE /* 160 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPLT /* 161 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPGE /* 162 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ICMPGT /* 163 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.IF_ICMPLE /* 164 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IF_ACMPEQ /* 165 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.GOTO /* 167 */:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.JSR /* 168 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.RET /* 169 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.TABLESWITCH /* 170 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LOOKUPSWITCH /* 171 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.IRETURN /* 172 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.LRETURN /* 173 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.FRETURN /* 174 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.DRETURN /* 175 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.RETURN /* 177 */:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.GETSTATIC /* 178 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.PUTSTATIC /* 179 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.GETFIELD /* 180 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.PUTFIELD /* 181 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INVOKESPECIAL /* 183 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.INVOKESTATIC /* 184 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.NEW /* 187 */:
                prepareSolutions = prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.NEWARRAY /* 188 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.ANEWARRAY /* 189 */:
                prepareSolutions = prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.ARRAYLENGTH /* 190 */:
                prepareSolutions = prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.ATHROW /* 191 */:
                prepareSolutions = prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.CHECKCAST /* 192 */:
                prepareSolutions = prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.INSTANCEOF /* 193 */:
                prepareSolutions = prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0));
                break;
            case Opcodes.MONITORENTER /* 194 */:
                prepareSolutions = prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0));
                break;
            case Opcodes.MONITOREXIT /* 195 */:
                prepareSolutions = prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0));
                break;
        }
        SolutionsFragment.list.set(solutionsHolder.getBindingAdapterPosition(), prepareSolutions);
        list.set(solutionsHolder.getBindingAdapterPosition(), prepareSolutions);
        solutionsHolder.imgItemTopicsSolutions.setImageResource(prepareSolutions.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (getItemViewType(viewType) == 0) {
            return new SeparatesHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_separate_years, parent, false));
        }
        final SolutionsHolder solutionsHolder2 = new SolutionsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topics_solutions, parent, false));
        solutionsHolder = solutionsHolder2;
        solutionsHolder2.lytItemTopicsSolution.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.SolutionsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SolutionsAdapter.lambda$onCreateViewHolder$0(SolutionsAdapter.SolutionsHolder.this, view);
            }
        });
        return solutionsHolder2;
    }

    static /* synthetic */ void lambda$onCreateViewHolder$0(SolutionsHolder solutionsHolder2, View view) {
        String str;
        TopicsSolutionsActivity.topics = false;
        solutionsHolder = solutionsHolder2;
        switch (solutionsHolder2.getBindingAdapterPosition()) {
            case 1:
                str = "correction-bac-sci-sciences-2025.pdf";
                break;
            case 2:
                str = "correction-bac-sc-math-2025.pdf";
                break;
            case 3:
                str = "correction-bac-sc-physique-2025.pdf";
                break;
            case 4:
                str = "correction-bac-sc-arabic-2025.pdf";
                break;
            case 5:
                str = "correction-bac-sc-his-geo-2025.pdf";
                break;
            case 6:
                str = "correction-bac-islamic-2025.pdf";
                break;
            case 7:
                str = "correction-bac-sc-philo-2025.pdf";
                break;
            case 8:
                str = "correction-bac-sc-english-2025.pdf";
                break;
            case 9:
                str = "correction-bac-sc-french-2025.pdf";
                break;
            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 99:
            case 116:
            case 126:
            case Opcodes.L2I /* 136 */:
            case Opcodes.I2C /* 146 */:
            case 156:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            default:
                str = null;
                break;
            case 11:
                str = "bac2024-sciences-se-correction.pdf";
                break;
            case 12:
                str = "bac2024-math-se-correction.pdf";
                break;
            case 13:
                str = "bac2024-physics-se-correction.pdf";
                break;
            case 14:
                str = "bac2024-arabic-sci-correction.pdf";
                break;
            case 15:
                str = "bac2024-hisgeo-semtm-correction.pdf";
                break;
            case 16:
                str = "bac2024-islamic-correction.pdf";
                break;
            case 17:
                str = "bac2024-philo-sem-correction.pdf";
                break;
            case 18:
                str = "bac2024-english-sci-correction.pdf";
                break;
            case 19:
                str = "bac2024-french-sci-correction.pdf";
                break;
            case 21:
                str = "bac2023-science-se-correction.pdf";
                break;
            case 22:
                str = "bac2023-math-se-correction.pdf";
                break;
            case 23:
                str = "bac2023-physics-se-correction.pdf";
                break;
            case 24:
                str = "bac2023-arabic-sci-correction.pdf";
                break;
            case 25:
                str = "bac2023-hisgeo-semtm-correction.pdf";
                break;
            case 26:
                str = "bac2023-islamic-correction.pdf";
                break;
            case 27:
                str = "bac2023-philo-sem-correction.pdf";
                break;
            case 28:
                str = "bac2023-english-sci-correction.pdf";
                break;
            case 29:
                str = "bac2023-french-sci-correction.pdf";
                break;
            case 31:
                str = "bac2022-sciences-se_correction.pdf";
                break;
            case 32:
                str = "bac2022-math-se_correction.pdf";
                break;
            case 33:
                str = "bac2022-physics-se_correction.pdf";
                break;
            case 34:
                str = "bac2022-arabic-sci_correction.pdf";
                break;
            case 35:
                str = "bac2022-hisgeo-semtm_correction.pdf";
                break;
            case 36:
                str = "bac2022-islamic_correction.pdf";
                break;
            case 37:
                str = "bac2022-philo-sem_correction.pdf";
                break;
            case 38:
                str = "bac2022-english-sci_correction.pdf";
                break;
            case 39:
                str = "bac2022-french-sci_correction.pdf";
                break;
            case 41:
                str = "sciences-sci-bac2021_correction.pdf";
                break;
            case 42:
                str = "math-sci-bac2021_correction.pdf";
                break;
            case 43:
                str = "phisique-sci-bac2021_correction.pdf";
                break;
            case 44:
                str = "arabic-sci-bac2021_correction.pdf";
                break;
            case 45:
                str = "hisgeo-sci-bac2021_correction.pdf";
                break;
            case 46:
                str = "islamique-sci-bac2021_correction.pdf";
                break;
            case 47:
                str = "philo-sci-bac2021_correction.pdf";
                break;
            case 48:
                str = "english-sci-bac2021_correction.pdf";
                break;
            case 49:
                str = "francais-sci-bac2021_correction.pdf";
                break;
            case 51:
                str = "sciences_se_bac2020_correction.pdf";
                break;
            case 52:
                str = "math_se_bac2020_correction.pdf";
                break;
            case 53:
                str = "physics_se_bac2020_correction.pdf";
                break;
            case 54:
                str = "arabic_sci_bac2020_correction.pdf";
                break;
            case 55:
                str = "hisgeo_semtm_bac2020_correction.pdf";
                break;
            case 56:
                str = "islamic_bac2020_correction.pdf";
                break;
            case 57:
                str = "philo_sem_bac2020_correction.pdf";
                break;
            case 58:
                str = "english-sci-bac2020-correction.pdf";
                break;
            case 59:
                str = "french_sci_bac2020_correction.pdf";
                break;
            case 61:
                str = "sciences_se_bac2019_correction.pdf";
                break;
            case 62:
                str = "math_se_bac2019_correction.pdf";
                break;
            case 63:
                str = "physics_se_bac2019_correction.pdf";
                break;
            case 64:
                str = "arabic_sci_bac2019_correction.pdf";
                break;
            case 65:
                str = "hisgeo_semtm_bac2019_correction.pdf";
                break;
            case 66:
                str = "islamic_bac2019_correction.pdf";
                break;
            case 67:
                str = "philo_se_bac2019_correction.pdf";
                break;
            case 68:
                str = "english_sci_bac2019_correction.pdf";
                break;
            case 69:
                str = "french_sci_bac2019_correction.pdf";
                break;
            case 71:
                str = "sciences_se_bac2018_correction.pdf";
                break;
            case 72:
                str = "math_se_bac2018_correction.pdf";
                break;
            case 73:
                str = "physics_se_bac2018_correction.pdf";
                break;
            case 74:
                str = "arabic_sci_bac2018_correction.pdf";
                break;
            case 75:
                str = "hisgeo_semtm_bac2018_correction.pdf";
                break;
            case 76:
                str = "islamic_bac2018_correction.pdf";
                break;
            case 77:
                str = "philo_sem_bac2018_correction.pdf";
                break;
            case 78:
                str = "english_sci_bac2018_correction.pdf";
                break;
            case 79:
                str = "french_sci_bac2018_correction.pdf";
                break;
            case 81:
                str = "bac2017_2-sciences-se-correction.pdf";
                break;
            case 82:
                str = "bac2017_2-math-se-correction.pdf";
                break;
            case 83:
                str = "bac2017_2-physics-se-correction.pdf";
                break;
            case 84:
                str = "bac2017_2-arabic-sci-correction.pdf";
                break;
            case 85:
                str = "bac2017_2-hisgeo-semtm-correction.pdf";
                break;
            case 86:
                str = "bac2017_2-islamic-correction.pdf";
                break;
            case 87:
                str = "bac2017_2-philo-sem-correction.pdf";
                break;
            case 88:
                str = "bac2017_2-english-sci-correction.pdf";
                break;
            case 89:
                str = "bac2017_2-french-sci-correction.pdf";
                break;
            case 90:
                str = "sciences_se_bac2017_correction.pdf";
                break;
            case 91:
                str = "math_se_bac2017_correction.pdf";
                break;
            case 92:
                str = "physics_se_bac2017_correction.pdf";
                break;
            case 93:
                str = "arabic_sci_bac2017_correction.pdf";
                break;
            case 94:
                str = "hisgeo_semtm_bac2017_correction.pdf";
                break;
            case 95:
                str = "islamic_bac2017_correction.pdf";
                break;
            case 96:
                str = "philo_sem_bac2017_correction.pdf";
                break;
            case 97:
                str = "english_sci_bac2017_correction.pdf";
                break;
            case 98:
                str = "french_sci_bac2017_correction.pdf";
                break;
            case 100:
                str = "sciences-se-bac2016_2-correction.pdf";
                break;
            case 101:
                str = "math-se-bac2016_2-correction.pdf";
                break;
            case 102:
                str = "physics-se-bac2016_2-correction.pdf";
                break;
            case 103:
                str = "arabic-sci-bac2016-correction.pdf";
                break;
            case 104:
                str = "hisgeo-semtm-bac2016_2-correction.pdf";
                break;
            case 105:
                str = "islamic-bac2016-correction.pdf";
                break;
            case 106:
                str = "philo-sem-bac2016_2-correction.pdf";
                break;
            case 107:
                str = "english-sci-bac2016_2-correction.pdf";
                break;
            case 108:
                str = "french-sci-bac2016_2-correction.pdf";
                break;
            case 109:
                str = "sciences-se-bac2016-correction.pdf";
                break;
            case 110:
                str = "math-se-bac2016-correction.pdf";
                break;
            case 111:
                str = "physics-se-bac2016-correction.pdf";
                break;
            case 112:
                str = "hisgeo-semtm-bac2016-correction.pdf";
                break;
            case 113:
                str = "philo-sem-bac2016-correction.pdf";
                break;
            case 114:
                str = "english-sci-bac2016-correction.pdf";
                break;
            case 115:
                str = "french-sci-bac2016-correction.pdf";
                break;
            case 117:
                str = "sciences-se-bac2015-correction.pdf";
                break;
            case 118:
                str = "math-se-bac2015-correction.pdf";
                break;
            case 119:
                str = "physics-se-bac2015-correction.pdf";
                break;
            case 120:
                str = "arabic-sci-bac2015-correction.pdf";
                break;
            case 121:
                str = "hisgeo-semtm-bac2015-correction.pdf";
                break;
            case 122:
                str = "islamic-bac2015-correction.pdf";
                break;
            case 123:
                str = "philo-sem-bac2015-correction.pdf";
                break;
            case 124:
                str = "english-sci-bac2015-correction.pdf";
                break;
            case 125:
                str = "french-sci-bac2015-correction.pdf";
                break;
            case 127:
                str = "sciences-se-bac2014-correction.pdf";
                break;
            case 128:
                str = "math-se-bac2014-correction.pdf";
                break;
            case Opcodes.LOR /* 129 */:
                str = "physics-se-bac2014-correction.pdf";
                break;
            case 130:
                str = "arabic-sci-bac2014-correction.pdf";
                break;
            case Opcodes.LXOR /* 131 */:
                str = "hisgeo-semtm-bac2014-correction.pdf";
                break;
            case Opcodes.IINC /* 132 */:
                str = "islamic-bac2014-correction.pdf";
                break;
            case Opcodes.I2L /* 133 */:
                str = "phylo-sem-bac2014-correction.pdf";
                break;
            case Opcodes.I2F /* 134 */:
                str = "english-sci-bac2014-correction.pdf";
                break;
            case Opcodes.I2D /* 135 */:
                str = "french-sci-bac2014-correction.pdf";
                break;
            case Opcodes.L2F /* 137 */:
                str = "sciences-se-bac2013-correction.pdf";
                break;
            case Opcodes.L2D /* 138 */:
                str = "math-se-bac2013-correction.pdf";
                break;
            case Opcodes.F2I /* 139 */:
                str = "physics-se-bac2013-correction.pdf";
                break;
            case Opcodes.F2L /* 140 */:
                str = "arabic-sci-bac2013-correction.pdf";
                break;
            case Opcodes.F2D /* 141 */:
                str = "hisgeo-semtm-bac2013-correction.pdf";
                break;
            case Opcodes.D2I /* 142 */:
                str = "islamic-bac2013-correction.pdf";
                break;
            case Opcodes.D2L /* 143 */:
                str = "philosophy-sem-bac2013-correction.pdf";
                break;
            case Opcodes.D2F /* 144 */:
                str = "english-sci-bac2013-correction.pdf";
                break;
            case Opcodes.I2B /* 145 */:
                str = "french-sci-bac2013-correction.pdf";
                break;
            case Opcodes.I2S /* 147 */:
                str = "sciences-se-bac2012-correction.pdf";
                break;
            case Opcodes.LCMP /* 148 */:
                str = "math-se-bac2012-correction.pdf";
                break;
            case Opcodes.FCMPL /* 149 */:
                str = "physics-se-bac2012-correction.pdf";
                break;
            case Opcodes.FCMPG /* 150 */:
                str = "arabic-sci-bac2012-correction.pdf";
                break;
            case Opcodes.DCMPL /* 151 */:
                str = "hisgeo-semtm-bac2012-correction.pdf";
                break;
            case Opcodes.DCMPG /* 152 */:
                str = "islamic-bac2012-correction.pdf";
                break;
            case 153:
                str = "philosophy-sem-bac2012-correction.pdf";
                break;
            case 154:
                str = "english-sci-bac2012-correction.pdf";
                break;
            case 155:
                str = "french-sci-bac2012-correction.pdf";
                break;
            case 157:
                str = "eddirasa-com-correction-bac-sci-science-2011.pdf";
                break;
            case 158:
                str = "eddirasa-com-correction-bac-sci-math-2011.pdf";
                break;
            case Opcodes.IF_ICMPEQ /* 159 */:
                str = "eddirasa-com-correction-bac-sci-physique-2011.pdf";
                break;
            case Opcodes.IF_ICMPNE /* 160 */:
                str = "eddirasa-com-correction-bac-ge-ara-2011.pdf";
                break;
            case Opcodes.IF_ICMPLT /* 161 */:
                str = "eddirasa-com-correction-bac-sci-his-geo-2011.pdf";
                break;
            case Opcodes.IF_ICMPGE /* 162 */:
                str = "eddirasa-com-correction-bac-li-islamic-2011.pdf";
                break;
            case Opcodes.IF_ICMPGT /* 163 */:
                str = "eddirasa-com-correction-bac-ge-philo-2011.pdf";
                break;
            case Opcodes.IF_ICMPLE /* 164 */:
                str = "eddirasa-com-correction-bac-ge-eng-2011.pdf";
                break;
            case Opcodes.IF_ACMPEQ /* 165 */:
                str = "eddirasa-com-correction-bac-ge-fra-2011.pdf";
                break;
            case Opcodes.GOTO /* 167 */:
                str = "eddirasa-com-correction-bac-sci-science-2010.pdf";
                break;
            case Opcodes.JSR /* 168 */:
                str = "eddirasa-com-correction-bac-sci-math-2010.pdf";
                break;
            case Opcodes.RET /* 169 */:
                str = "eddirasa-com-correction-bac-sci-physique-2010.pdf";
                break;
            case Opcodes.TABLESWITCH /* 170 */:
                str = "eddirasa-com-correction-bac-ge-ara-2010.pdf";
                break;
            case Opcodes.LOOKUPSWITCH /* 171 */:
                str = "eddirasa-com-correction-bac-sci-his-geo-2010.pdf";
                break;
            case Opcodes.IRETURN /* 172 */:
                str = "eddirasa-com-correction-bac-li-islamic-2010.pdf";
                break;
            case Opcodes.LRETURN /* 173 */:
                str = "eddirasa-com-correction-bac-ge-philo-2010.pdf";
                break;
            case Opcodes.FRETURN /* 174 */:
                str = "eddirasa-com-correction-bac-ge-eng-2010.pdf";
                break;
            case Opcodes.DRETURN /* 175 */:
                str = "eddirasa-com-correction-bac-ge-fra-2010.pdf";
                break;
            case Opcodes.RETURN /* 177 */:
                str = "eddirasa-correction-bac-sci-science-2009.pdf";
                break;
            case Opcodes.GETSTATIC /* 178 */:
                str = "eddirasa-correction-bac-sci-math-2009.pdf";
                break;
            case Opcodes.PUTSTATIC /* 179 */:
                str = "eddirasa-correction-bac-sci-physique-2009.pdf";
                break;
            case Opcodes.GETFIELD /* 180 */:
                str = "eddirasa-correction-bac-ge-ara-2009.pdf";
                break;
            case Opcodes.PUTFIELD /* 181 */:
                str = "eddirasa-correction-bac-sci-his-geo-2009.pdf";
                break;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                str = "eddirasa-correction-bac-li-islamic-2009.pdf";
                break;
            case Opcodes.INVOKESPECIAL /* 183 */:
                str = "eddirasa-correction-bac-ge-philo-2009.pdf";
                break;
            case Opcodes.INVOKESTATIC /* 184 */:
                str = "eddirasa-correction-bac-ge-eng-2009.pdf";
                break;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                str = "eddirasa-correction-bac-ge-fra-2009.pdf";
                break;
            case Opcodes.NEW /* 187 */:
                str = "eddirasa-correction-bac-sci-science-2008.pdf";
                break;
            case Opcodes.NEWARRAY /* 188 */:
                str = "eddirasa-correction-bac-sci-math-2008.pdf";
                break;
            case Opcodes.ANEWARRAY /* 189 */:
                str = "eddirasa-correction-bac-sci-physique-2008.pdf";
                break;
            case Opcodes.ARRAYLENGTH /* 190 */:
                str = "eddirasa-correction-bac-ge-ara-2008.pdf";
                break;
            case Opcodes.ATHROW /* 191 */:
                str = "eddirasa-correction-bac-sci-his-geo-2008.pdf";
                break;
            case Opcodes.CHECKCAST /* 192 */:
                str = "eddirasa-correction-bac-li-islamic-2008.pdf";
                break;
            case Opcodes.INSTANCEOF /* 193 */:
                str = "eddirasa-correction-bac-ge-philo-2008.pdf";
                break;
            case Opcodes.MONITORENTER /* 194 */:
                str = "eddirasa-correction-bac-ge-eng-2008.pdf";
                break;
            case Opcodes.MONITOREXIT /* 195 */:
                str = "eddirasa-correction-bac-ge-fra-2008.pdf";
                break;
        }
        if (solutionsHolder2.getBindingAdapterPosition() > 195 || solutionsHolder2.getBindingAdapterPosition() < 1 || solutionsHolder2.getBindingAdapterPosition() == 10 || solutionsHolder2.getBindingAdapterPosition() == 20 || solutionsHolder2.getBindingAdapterPosition() == 30 || solutionsHolder2.getBindingAdapterPosition() == 40 || solutionsHolder2.getBindingAdapterPosition() == 50 || solutionsHolder2.getBindingAdapterPosition() == 60 || solutionsHolder2.getBindingAdapterPosition() == 70 || solutionsHolder2.getBindingAdapterPosition() == 80 || solutionsHolder2.getBindingAdapterPosition() == 99 || solutionsHolder2.getBindingAdapterPosition() == 116 || solutionsHolder2.getBindingAdapterPosition() == 126 || solutionsHolder2.getBindingAdapterPosition() == 136 || solutionsHolder2.getBindingAdapterPosition() == 146 || solutionsHolder2.getBindingAdapterPosition() == 156 || solutionsHolder2.getBindingAdapterPosition() == 166 || solutionsHolder2.getBindingAdapterPosition() == 176 || solutionsHolder2.getBindingAdapterPosition() == 186) {
            return;
        }
        TopicsSolutionsActivity.file_Name = str;
        TopicsSolutionsActivity.getInstance().openContent(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            Separate separate = (Separate) list.get(position);
            SeparatesHolder separatesHolder = (SeparatesHolder) holder;
            separatesHolder.txtTitle.setText(separate.getTitle());
            if (separate.isDarkmode()) {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#424445"));
                return;
            } else {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#E6ECEF"));
                return;
            }
        }
        Solutions solutions = (Solutions) list.get(position);
        SolutionsHolder solutionsHolder2 = (SolutionsHolder) holder;
        solutionsHolder2.txtModule.setText(solutions.getModule());
        solutionsHolder2.txtSubject.setText(solutions.getInformation());
        solutionsHolder2.imgItemTopicsSolutions.setImageResource(solutions.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return list.get(position) instanceof Separate ? 0 : 1;
    }

    public class SolutionsHolder extends RecyclerView.ViewHolder {
        private final ImageView imgItemTopicsSolutions;
        private final LinearLayout lytItemTopicsSolution;
        private final TextView txtModule;
        private final TextView txtSubject;

        SolutionsHolder(View itemView) {
            super(itemView);
            this.txtModule = (TextView) itemView.findViewById(R.id.txtModule);
            this.txtSubject = (TextView) itemView.findViewById(R.id.txtSubject);
            this.imgItemTopicsSolutions = (ImageView) itemView.findViewById(R.id.imgItemTopicsSolutions);
            this.lytItemTopicsSolution = (LinearLayout) itemView.findViewById(R.id.lytItemTopicsSolution);
        }
    }

    public class SeparatesHolder extends RecyclerView.ViewHolder {
        private final LinearLayout lytItemSeparate;
        private final TextView txtTitle;

        SeparatesHolder(View itemView) {
            super(itemView);
            this.txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            this.lytItemSeparate = (LinearLayout) itemView.findViewById(R.id.lytItemSeparate);
        }
    }
}
